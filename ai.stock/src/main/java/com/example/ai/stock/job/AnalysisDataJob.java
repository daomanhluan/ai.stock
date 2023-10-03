package com.example.ai.stock.job;

import com.example.ai.stock.domain.stock.model.Stock;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.domain.stock.processor.StockHistoryProcessor;
import com.example.ai.stock.configuration.constant.StockConstant;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AnalysisDataJob implements JobBackground {

  private final StockHistoryProcessor stockHistoryProcessor;

  @Override
  public void process() throws JsonProcessingException {
    List<StockHistory> stockHistories =
        stockHistoryProcessor.findByCode(StockConstant.ANALYSIS_STOCKS.get(0)).stream()
            .sorted(Comparator.comparing(StockHistory::getDay))
            .collect(Collectors.toList());
    List<Stock> evaluationStocks = new ArrayList<>();

    StockHistory lastStockHistoryDay = null;
    for (StockHistory stockHistory : stockHistories) {
      evaluationStocks.add(toStock(stockHistory, lastStockHistoryDay));
      lastStockHistoryDay = stockHistory;
    }


  }

  private Stock toStock(StockHistory stockHistory, StockHistory lastStockHistoryDay) {
    return Stock.builder()
        .code(stockHistory.getCode())
        .baseData(
            Objects.nonNull(lastStockHistoryDay)
                ? lastStockHistoryDay.getAverageDataStatisticToday()
                : null)
        .changePercent(stockHistory.getPriceFluctuation())
        .volumeEvaluation((int) (stockHistory.getVolume() * 0.8f))
        .priceEvaluation(stockHistory.getClosedPrice())
        .evaluationDay(stockHistory.getDay())
        .build();
  }
}
