package com.example.ai.stock.job;

import com.example.ai.stock.aggregate.stock.model.StockHistory;
import com.example.ai.stock.aggregate.stock.processor.StockHistoryProcessor;
import com.example.ai.stock.configuration.constant.GlobalConstant;
import com.example.ai.stock.configuration.constant.StockConstant;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AnalysisDataJob implements JobBackground {

  private final StockHistoryProcessor stockHistoryProcessor;

  @Override
  public void process() throws JsonProcessingException {
    List<StockHistory> stockHistories =
        stockHistoryProcessor.findByCode(StockConstant.ANALYSIS_STOCKS.get(0));


  }
}
