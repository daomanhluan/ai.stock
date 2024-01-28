package com.example.ai.stock.business.filter;

import com.example.ai.stock.domain.stock.model.Stock;
import com.example.ai.stock.domain.stock.model.StockHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CompositeHotStockTodayFilter implements FilterStock {

  @Qualifier("volumeFilter")
  private final FilterStock volumeFilter;

  @Qualifier("changePercentFilter")
  private final FilterStock changePercentFilter;

  private List<FilterStock> allFilter = new ArrayList<>();

  @PostConstruct
  public void init() {
    allFilter.add(volumeFilter);
    allFilter.add(changePercentFilter);
  }

  @Override
  public List<StockHistory> filter(List<StockHistory> data) {
    data =
        data.stream()
            .filter(e -> Objects.nonNull(e.getDataStatisticToday()))
            .collect(Collectors.toList());
    for (FilterStock f : allFilter) {
      data = f.filter(data);
    }
    return data;
  }
}
