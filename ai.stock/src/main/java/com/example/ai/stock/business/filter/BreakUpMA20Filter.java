package com.example.ai.stock.business.filter;

import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class BreakUpMA20Filter implements FilterStock {

  private final LogService logService;

  @Override
  public List<StockHistory> filter(List<StockHistory> stocks) {
//    logService.saveLogStockExclude(stocks, FilterStockEnum.BREAK_MA);
    return stocks.stream().filter(e -> e.isBreakMAs()).collect(Collectors.toList());
  }
}
