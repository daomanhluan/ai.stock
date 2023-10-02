package com.example.ai.stock.service.filter;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class StockFilter implements FilterPattern<Element> {

  private Set<String> COLUMN_NAME = Set.of("Ngày", "Giá", "GD", "KT", "GT");

  @Override
  public List<Element> filter(List<Element> data) {

    List<Element> result = new ArrayList<>();
    for (Element e : data) {
      Elements tags = e.select("td");
      for (int i = 0; i < tags.size(); i++) {
        if (!COLUMN_NAME.contains(tags.get(0).text())) {
          result.add(e);
          break;
        }
      }
    }
    return result;
  }
}
