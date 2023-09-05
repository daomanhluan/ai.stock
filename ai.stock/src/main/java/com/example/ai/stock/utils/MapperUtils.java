package com.example.ai.stock.utils;

import com.example.ai.stock.model.Commodity;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class MapperUtils {

  public static List<Commodity> mapperToCommodity(List<Element> elements) {
    List<Commodity> commodities = new ArrayList<>();
    for (Element e : elements) {
      try {
        Elements fields = e.select("td");
        Commodity temp =
            Commodity.builder()
                .name(fields.get(0).text())
                .price(
                    Float.valueOf(StringUtils.removeLastCharacter(fields.get(1).text())))
                .fluctuatePercentInDay(
                    Float.valueOf(StringUtils.removeLastCharacter(fields.get(3).text())))
                .fluctuatePercentInWeek(
                    Float.valueOf(StringUtils.removeLastCharacter(fields.get(4).text())))
                .fluctuatePercentInMonth(
                    Float.valueOf(StringUtils.removeLastCharacter(fields.get(5).text())))
                .build();
        commodities.add(temp);
      } catch (Exception ex) {
      }
    }
    return commodities;
  }
}
