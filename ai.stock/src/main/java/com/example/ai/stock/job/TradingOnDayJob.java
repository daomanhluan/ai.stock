package com.example.ai.stock.job;

import com.example.ai.stock.domain.stock.model.AverageDataStatistic;
import com.example.ai.stock.domain.stock.model.Stock;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.domain.stock.processor.StockHistoryProcessor;
import com.example.ai.stock.configuration.constant.GlobalConstant;
import com.example.ai.stock.infrastruture.entity.StockCategoryEntity;
import com.example.ai.stock.infrastruture.feign_client.IboardClient;
import com.example.ai.stock.infrastruture.repository.StockCategoryRepository;
import com.example.ai.stock.infrastruture.request.GetStockInfoRequest;
import com.example.ai.stock.infrastruture.response.StockInfoResponse;
import com.example.ai.stock.infrastruture.vo.StockInfo;
import com.example.ai.stock.service.notification.Notify;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class TradingOnDayJob implements JobBackground {

  private final StockCategoryRepository stockCategoryRepository;
  private final StockHistoryProcessor stockHistoryProcessor;
  private final IboardClient iboardClient;
  private final Notify teleNotification;

//  @EventListener(ApplicationReadyEvent.class)
  @Override
  public void process() throws JsonProcessingException {
    List<StockCategoryEntity> stockCategoryEntities = stockCategoryRepository.findAll();
    List<List<StockCategoryEntity>> allStockCategories = Lists.partition(stockCategoryEntities, 20);

    List<Stock> stocks = new ArrayList<>();

    for (List<StockCategoryEntity> stockCategories : allStockCategories) {
      List<String> codes =
          stockCategories.stream().map(e -> e.getCode()).collect(Collectors.toList());
      List<StockHistory> stockHistories =
          stockHistoryProcessor.findByCodesAndDay(codes, LocalDate.now().minusDays(1));

      GetStockInfoRequest request = GetStockInfoRequest.builder().stocks(codes).build();
      StockInfoResponse stockInfoResponse = iboardClient.getStockHistory(request);
      if (Objects.nonNull(stockInfoResponse)
          && Objects.equals(stockInfoResponse.getCode(), "SUCCESS")) {
        List<StockInfo> stockInfos = stockInfoResponse.getData();
        stocks.addAll(findPotentialStock(stockInfos, stockHistories));
      }
    }

    List<Stock> stocksSorted =
        stocks.stream()
            .sorted(Comparator.comparing(Stock::getRateVolume10Day))
            .collect(Collectors.toList());
    teleNotification.sendMessage(stocksSorted.toString());
  }

  private List<Stock> findPotentialStock(
      List<StockInfo> stockInfos, List<StockHistory> stockHistories) {

    List<Stock> result = new ArrayList<>();
    for (StockInfo stockInfo : stockInfos) {
      Optional<StockHistory> optionalStockHistory =
          stockHistories.stream()
              .filter(e -> e.getCode().equals(stockInfo.getStockSymbol()))
              .findFirst();
      if (optionalStockHistory.isPresent()) {
        StockHistory stockHistory = optionalStockHistory.get();
        AverageDataStatistic dataToday = stockHistory.getAverageDataStatisticToday();
        result.add(isPotentialStock(stockInfo, dataToday));
      }
    }
    return result.stream().filter(e -> Objects.nonNull(e)).collect(Collectors.toList());
  }

  private Stock isPotentialStock(StockInfo stockInfo, AverageDataStatistic data) {
    Integer averageVolume10Day = data.getAverageVolume10Day();
    Integer averageVolume20Day = data.getAverageVolume20Day();

    Integer volumeRightNow = stockInfo.getTotalShare();
    Float percentChange = stockInfo.getPriceChangePercent();

    Float volumeRate10Day = (float) (volumeRightNow / averageVolume10Day);
    Float volumeRate20Day = (float) (volumeRightNow / averageVolume20Day);

    Float newAveragePrice10Day =
        (data.getAveragePrice10Day() * 10 + stockInfo.getMatchedPrice() - data.getLastPrice10Day())
            / 10;
    Float newAveragePrice20Day =
        (data.getAveragePrice20Day() * 20 + stockInfo.getMatchedPrice() - data.getLastPrice20Day())
            / 20;
    Float newAveragePrice50Day =
        (data.getAveragePrice50ay() * 50 + stockInfo.getMatchedPrice() - data.getLastPrice50Day())
            / 50;

    if (volumeRate10Day >= GlobalConstant.VOLUME_RATE_10_DAY_EXPECT
        && volumeRate20Day >= GlobalConstant.VOLUME_RATE_20_DAY_EXPECT
        && percentChange >= GlobalConstant.PRICE_CHANGE_PERCENT
        && newAveragePrice10Day > data.getAveragePrice20Day()
        && newAveragePrice10Day > data.getLastPrice50Day()
        && newAveragePrice20Day > data.getAveragePrice50ay()
        && stockInfo.getTotalShare() > GlobalConstant.MIN_VOLUME) {
      return Stock.builder()
          .code(stockInfo.getStockSymbol())
          .priceEvaluation(stockInfo.getMatchedPrice())
          .volumeEvaluation(stockInfo.getTotalShare())
          .changePercent(stockInfo.getPriceChangePercent())
          .averageVolume10Day(data.getAverageVolume10Day())
          .averageVolume20Day(data.getAverageVolume20Day())
          .averageVolume50Day(data.getAverageVolume50Day())
          .rateVolume10Day(volumeRate10Day)
          .rateVolume20Day(volumeRate20Day)
          .averagePrice10Day(data.getAveragePrice10Day())
          .averagePrice20Day(data.getAveragePrice20Day())
          .build();
    }
    return null;
  }
}
