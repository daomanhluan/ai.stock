package com.example.ai.stock.business.filter;

import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class ChangePercentFilter implements FilterStock {
  private final LogService logService;

  @Override
  public List<StockHistory> filter(List<StockHistory> stocks) {
//    logService.saveLogStockExclude(stocks, FilterStockEnum.BY_PRICE);
    return stocks.stream().filter(e -> e.isChangePercentHigh()).collect(Collectors.toList());
  }
}
