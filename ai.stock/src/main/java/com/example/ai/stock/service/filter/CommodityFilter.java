package com.example.ai.stock.service.filter;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CommodityFilter implements FilterPattern<Element> {

  private final Set<String> commoditiesNeedFollow =
      Arrays.asList(
              "Steel CNY/T",
              "HRC Steel USD/T",
              "Sugar USd/Lbs",
              "Rice USD/cwt",
              "Coffee USd/Lbs",
              "Urea Ammonium EUR/MT",
              "Urea USD/T"
              )
          .stream()
          .collect(Collectors.toSet());

  @Override
  public List<Element> filter(List<Element> data) {
    List<Element> result = new ArrayList<>();
    for (Element e : data) {
      Elements tags = e.select("td");
      for (int i = 0; i < tags.size(); i++) {
        if (commoditiesNeedFollow.contains(tags.get(0).text())) {
          result.add(e);
          break;
        }
      }
    }
    return result;
  }
}
