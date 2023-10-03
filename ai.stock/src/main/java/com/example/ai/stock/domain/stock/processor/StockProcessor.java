package com.example.ai.stock.domain.stock.processor;

import com.example.ai.stock.domain.stock.model.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class StockProcessor implements IStockProcessor {
  private final StockHistoryProcessor stockHistoryProcessor;

  @Override
  public void enrichAverageData(List<Stock> stocks) {

      List<String> codes = stocks.stream().map(e->e.getCode()).collect(Collectors.toList());
  }
}
