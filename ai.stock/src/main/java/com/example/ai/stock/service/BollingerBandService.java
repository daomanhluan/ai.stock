package com.example.ai.stock.service;

import com.example.ai.stock.common.constant.StockConstant;
import com.example.ai.stock.common.utils.JsonUtils;
import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.example.ai.stock.common.utils.NumberUtils;
import com.example.ai.stock.domain.stock.model.BollingerBand;
import com.example.ai.stock.domain.stock.model.StockCategory;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.domain.stock.processor.IStockHistoryProcessor;
import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import com.example.ai.stock.infrastruture.repository.StockCategoryRepository;
import com.example.ai.stock.infrastruture.repository.StockHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BollingerBandService {

  private static final Integer LENGTH_BOLLINGER_BAND = 20;
  private static final Integer STANDARD_DEVIATIONS = 2;

  private final StockHistoryRepository stockHistoryRepository;
  private final StockCategoryRepository stockCategoryRepository;
  private final IStockHistoryProcessor iStockHistoryProcessor;

//  @EventListener(ApplicationReadyEvent.class)
//  public void test() {
//    List<StockCategory> stockCategories =
//        ModelMapperUtils.mapList(stockCategoryRepository.findAll(), StockCategory.class);
//    for (StockCategory stockHistory : stockCategories) {
//      if (StockConstant.ALL_CP.contains(stockHistory.getCode())) {
//        List<StockHistory> stockHistories =
//                iStockHistoryProcessor.findByCode(stockHistory.getCode()).stream()
//                        .collect(Collectors.toList());
//        calculateBollingerBand(stockHistories);
//
//        stockHistoryRepository.saveAll(ModelMapperUtils.mapList(stockHistories, StockHistoryEntity.class));
//      }
//    }
//  }

  public void calculateBollingerBand(List<StockHistory> stockHistories) {
    stockHistories =
        stockHistories.stream()
            .sorted(Comparator.comparing(StockHistory::getDay))
            .collect(Collectors.toList());
    Map<LocalDate, Double> dayWithSma = calculateSMA(stockHistories);
    Map<LocalDate, Double> dayWithUpperBand = calculateUpperBand(stockHistories);
    Map<LocalDate, Double> dayWithLowerBand = calculateLowerBand(stockHistories);

    for (StockHistory st : stockHistories) {
      Double sma = dayWithSma.get(st.getDay());
      Double upperBand = dayWithUpperBand.get(st.getDay());
      Double lowerBand = dayWithLowerBand.get(st.getDay());
      if (Objects.nonNull(sma)) {
        BollingerBand bb =
            BollingerBand.builder()
                .middleBand(NumberUtils.round(sma))
                .upperBand(NumberUtils.round(upperBand))
                .lowerBand(NumberUtils.round(lowerBand))
                .build();
        try {
          st.setBollingerBandStr(JsonUtils.toJson(bb));
        } catch (Exception e) {
        }
      }
    }
  }

  private static Map<LocalDate, Double> calculateSMA(List<StockHistory> stockHistories) {
    Map<LocalDate, Double> res = new TreeMap<>();
    for (int i = LENGTH_BOLLINGER_BAND - 1; i < stockHistories.size(); i++) {
      double sum = 0.0;
      for (int j = i - LENGTH_BOLLINGER_BAND + 1; j <= i; j++) {
        sum += stockHistories.get(j).getClosedPrice();
      }
      double sma = sum / LENGTH_BOLLINGER_BAND;
      res.put(stockHistories.get(i).getDay(), sma);
    }
    return res;
  }

  // Calculate the Upper Bollinger Band
  private static Map<LocalDate, Double> calculateUpperBand(List<StockHistory> stockHistories) {
    Map<LocalDate, Double> res = new HashMap<>();
    Map<LocalDate, Double> dateWithSma = calculateSMA(stockHistories);
    List<Double> smaValues = new ArrayList<>(dateWithSma.values());
    for (int i = LENGTH_BOLLINGER_BAND - 1; i < stockHistories.size(); i++) {
      double sumSquaredDeviations = 0.0d;
      for (int j = i - LENGTH_BOLLINGER_BAND + 1; j <= i; j++) {
        double deviation =
            stockHistories.get(j).getClosedPrice() - smaValues.get(i - LENGTH_BOLLINGER_BAND + 1);
        sumSquaredDeviations += deviation * deviation;
      }
      double standardDeviation = Math.sqrt(sumSquaredDeviations / LENGTH_BOLLINGER_BAND);
      double upperBand =
          smaValues.get(i - LENGTH_BOLLINGER_BAND + 1) + (STANDARD_DEVIATIONS * standardDeviation);
      res.put(stockHistories.get(i).getDay(), upperBand);
    }
    return res;
  }

  // Calculate the Lower Bollinger Band
  private static Map<LocalDate, Double> calculateLowerBand(List<StockHistory> stockHistories) {
    Map<LocalDate, Double> res = new HashMap<>();
    Map<LocalDate, Double> dateWithSma = calculateSMA(stockHistories);
    List<Double> smaValues = new ArrayList<>(dateWithSma.values());
    for (int i = LENGTH_BOLLINGER_BAND - 1; i < stockHistories.size(); i++) {
      double sumSquaredDeviations = 0.0;
      for (int j = i - LENGTH_BOLLINGER_BAND + 1; j <= i; j++) {
        double deviation =
            stockHistories.get(j).getClosedPrice() - smaValues.get(i - LENGTH_BOLLINGER_BAND + 1);
        sumSquaredDeviations += deviation * deviation;
      }
      double standardDeviation = Math.sqrt(sumSquaredDeviations / LENGTH_BOLLINGER_BAND);
      double lowerBand =
          smaValues.get(i - LENGTH_BOLLINGER_BAND + 1) - (STANDARD_DEVIATIONS * standardDeviation);
      res.put(stockHistories.get(i).getDay(), lowerBand);
    }
    return res;
  }
}
