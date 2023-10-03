package com.example.ai.stock.service.evaluate;

import com.example.ai.stock.aggregate.stock.model.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class ChangePercentFilter implements FilterStock {
  @Override
  public List<Stock> filter(List<Stock> stocks) {
    return stocks.stream().filter(e -> e.isChangePercentHigh()).collect(Collectors.toList());
  }
}
