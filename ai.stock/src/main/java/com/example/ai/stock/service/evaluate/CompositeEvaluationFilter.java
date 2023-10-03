package com.example.ai.stock.service.evaluate;

import com.example.ai.stock.domain.stock.model.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CompositeEvaluationFilter implements FilterStock {

  @Qualifier("priceFilter")
  private final FilterStock priceFilter;

  @Qualifier("volumeFilter")
  private final FilterStock volumeFilter;

  @Qualifier("changePercentFilter")
  private final FilterStock changePercentFilter;

  private List<FilterStock> allFilter = new ArrayList<>();

  @PostConstruct
  public void init() {
    allFilter.add(priceFilter);
    allFilter.add(volumeFilter);
    allFilter.add(changePercentFilter);
  }

  @Override
  public List<Stock> filter(List<Stock> data) {
    for (FilterStock f : allFilter) {
      data = f.filter(data);
    }
    return data;
  }
}
