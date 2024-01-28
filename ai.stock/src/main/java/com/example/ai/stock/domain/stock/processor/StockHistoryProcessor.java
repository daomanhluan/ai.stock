package com.example.ai.stock.domain.stock.processor;

import com.example.ai.stock.domain.stock.model.AverageDataStatistic;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import com.example.ai.stock.infrastruture.repository.StockCategoryRepository;
import com.example.ai.stock.infrastruture.repository.StockHistoryRepository;
import com.example.ai.stock.common.utils.JsonUtils;
import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@Slf4j
public class StockHistoryProcessor implements IStockHistoryProcessor {

  private final StockCategoryRepository stockCategoryRepository;
  private final StockHistoryRepository stockHistoryRepository;

  @Override
  public List<StockHistory> findByCode(String code) {
    List<StockHistory> stockHistories =
        ModelMapperUtils.mapList(stockHistoryRepository.findByCode(code), StockHistory.class);
    for (StockHistory stockHistory : stockHistories) {
      if (Objects.nonNull(stockHistory.getDataStatisticYesterday())) {
        try {
          stockHistory.setAverageDataStatisticYesterday(
              JsonUtils.map(stockHistory.getDataStatisticYesterday(), new TypeReference<>() {}));
        } catch (Exception e) {
        }
      }
      if (Objects.nonNull(stockHistory.getDataStatisticToday())) {
        try {
          stockHistory.setAverageDataStatisticToday(
              JsonUtils.map(stockHistory.getDataStatisticToday(), new TypeReference<>() {}));
        } catch (Exception e) {
        }
      }
    }
    return stockHistories;
  }

  @Override
  public List<StockHistory> findByCodesAndDay(List<String> codes, LocalDate date) {
    List<StockHistory> stockHistories =
        ModelMapperUtils.mapList(
            stockHistoryRepository.findByCodeInAndDay(codes, date), StockHistory.class);
    for (StockHistory stockHistory : stockHistories) {
      if (Objects.nonNull(stockHistory.getDataStatisticYesterday())) {
        try {
          stockHistory.setAverageDataStatisticYesterday(
              JsonUtils.map(stockHistory.getDataStatisticYesterday(), new TypeReference<>() {}));
        } catch (Exception e) {
        }
      }
      if (Objects.nonNull(stockHistory.getAverageDataStatisticToday())) {
        try {
          stockHistory.setAverageDataStatisticToday(
              JsonUtils.map(stockHistory.getDataStatisticToday(), new TypeReference<>() {}));
        } catch (Exception e) {
        }
      }
    }
    return stockHistories;
  }

  @Override
  public void enrichDataStatisticToday(List<StockHistory> stockHistories) {
    List<StockHistory> recordProcessed = new ArrayList<>();
    if(stockHistories.isEmpty()) return;
    for (StockHistory stockHistory : stockHistories) {
      List<StockHistory> stockHistories10Day = pagingData(recordProcessed, 10);
      List<StockHistory> stockHistories20Day = pagingData(recordProcessed, 20);
      List<StockHistory> stockHistories50Day = pagingData(recordProcessed, 50);
      List<StockHistory> stockHistories100Day = pagingData(recordProcessed, 100);
      List<StockHistory> stockHistories200Day = pagingData(recordProcessed, 200);

      recordProcessed.add(stockHistory);
      if (stockHistories10Day.isEmpty()) continue;

      try {
        AverageDataStatistic dataToday =
            buildAverageDataStatisticToday(
                stockHistories10Day,
                stockHistories20Day,
                stockHistories50Day,
                stockHistories100Day,
                stockHistories200Day);
        stockHistory.setDataStatisticToday(JsonUtils.toJson(dataToday));
      } catch (JsonProcessingException e) {
        log.error(
            "JsonProcessingException enrichDataStatisticToday {} {}", e, stockHistory.getId());
      }
    }
    log.info(Thread.currentThread().getName() + "==========enrichDataStatisticToday DONE {}",stockHistories.get(0).getCode());
  }



  private AverageDataStatistic buildAverageDataStatisticToday(
      List<StockHistory> stockHistories10Day,
      List<StockHistory> stockHistories20Day,
      List<StockHistory> stockHistories50Day,
      List<StockHistory> stockHistories100Day,
      List<StockHistory> stockHistories200Day) {
    Float closedPrice10Day =
        (float)
            stockHistories10Day.stream().mapToDouble(e -> e.getClosedPrice()).average().orElse(0d);
    Float closedPrice20Day =
        (float)
            stockHistories20Day.stream().mapToDouble(e -> e.getClosedPrice()).average().orElse(0d);
    Float closedPrice50Day =
        (float)
            stockHistories50Day.stream().mapToDouble(e -> e.getClosedPrice()).average().orElse(0d);
    Float closedPrice100Day =
        (float)
            stockHistories100Day.stream().mapToDouble(e -> e.getClosedPrice()).average().orElse(0d);
    Float closedPrice200Day =
        (float)
            stockHistories200Day.stream().mapToDouble(e -> e.getClosedPrice()).average().orElse(0d);

    Float averageVolume10Day =
        (float) stockHistories10Day.stream().mapToDouble(e -> e.getVolume()).average().orElse(0d);
    Float averageVolume20Day =
        (float) stockHistories20Day.stream().mapToDouble(e -> e.getVolume()).average().orElse(0d);
    Float averageVolume50Day =
        (float) stockHistories50Day.stream().mapToDouble(e -> e.getVolume()).average().orElse(0d);
    Float averageVolume100Day =
        (float) stockHistories100Day.stream().mapToDouble(e -> e.getVolume()).average().orElse(0d);
    Float averageVolume200Day =
        (float) stockHistories200Day.stream().mapToDouble(e -> e.getVolume()).average().orElse(0d);

    return AverageDataStatistic.builder()
        .averagePrice10Day(closedPrice10Day)
        .averagePrice20Day(closedPrice20Day)
        .averagePrice50ay(closedPrice50Day)
        .averagePrice100Day(closedPrice100Day)
        .averagePrice200Day(closedPrice200Day)
        .lastPrice10Day(stockHistories10Day.get(stockHistories10Day.size() - 1).getClosedPrice())
        .lastPrice20Day(stockHistories20Day.get(stockHistories20Day.size() - 1).getClosedPrice())
        .lastPrice50Day(stockHistories50Day.get(stockHistories50Day.size() - 1).getClosedPrice())
        .lastPrice100Day(stockHistories100Day.get(stockHistories100Day.size() - 1).getClosedPrice())
        .lastPrice200Day(stockHistories200Day.get(stockHistories200Day.size() - 1).getClosedPrice())
        .averageVolume10Day(averageVolume10Day)
        .averageVolume20Day(averageVolume20Day)
        .averageVolume50Day(averageVolume50Day)
        .averageVolume100Day(averageVolume100Day)
        .averageVolume200Day(averageVolume200Day)
        .lastVolume10Day(stockHistories10Day.get(stockHistories10Day.size() - 1).getVolume())
        .lastVolume20Day(stockHistories20Day.get(stockHistories20Day.size() - 1).getVolume())
        .lastVolume50Day(stockHistories50Day.get(stockHistories50Day.size() - 1).getVolume())
        .lastVolume100Day(stockHistories100Day.get(stockHistories100Day.size() - 1).getVolume())
        .lastVolume200Day(stockHistories200Day.get(stockHistories200Day.size() - 1).getVolume())
        .build();
  }

  private List<StockHistory> pagingData(List<StockHistory> stockHistories, int size) {
    return stockHistories.stream()
        .sorted(Comparator.comparing(StockHistory::getDay).reversed())
        .limit(size)
        .collect(Collectors.toList());
  }


  @Override
  public List<StockHistoryEntity> findByIds(List<Integer> ids) {
    return stockHistoryRepository.findByIdIn(ids);
  }

  @Override
  public void enrichAveragePrice10Day(List<StockHistory> stockHistories) {
    for (StockHistory stockHistory : stockHistories) {
      AverageDataStatistic dataStatisticYesterday = stockHistory.getAverageDataStatisticYesterday();
      AverageDataStatistic dataStatisticToday = stockHistory.getAverageDataStatisticToday();
    }
  }

  @Override
  public void enrichAveragePrice20Day(List<StockHistory> stockHistories) {}

  @Override
  public void enrichAveragePrice50Day(List<StockHistory> stockHistories) {}

  @Override
  public void enrichAveragePrice100Day(List<StockHistory> stockHistories) {}

  @Override
  public void enrichAveragePrice200Day(List<StockHistory> stockHistories) {}

  @Override
  public void saveAll(List<StockHistoryEntity> stockHistoryEntities) {
    stockHistoryRepository.saveAllAndFlush(stockHistoryEntities);
  }

  public void enrichAveragePrice10DayYesterday(List<StockHistory> stockHistories) {
    for (StockHistory stockHistory : stockHistories) {
      AverageDataStatistic dataYesterday = AverageDataStatistic.builder().build();
    }
  }
}
