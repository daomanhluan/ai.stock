package com.example.ai.stock.common.utils;

import com.example.ai.stock.domain.commodity.Commodity;
import com.example.ai.stock.domain.stock.model.StockHistory;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
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

  public static List<StockHistory> mapperToStockHistory(List<Element> elements,String code) {
    List<StockHistory> stockHistories = new ArrayList<>();
    Elements fields=null;
    for (Element e : elements) {
      try {
        fields = e.select("td");
        StockHistory temp =
                StockHistory.builder()
                        .day((DateTimeUtils.toLocalDate(fields.get(0).text())))
                        .closedPrice(Float.valueOf(fields.get(2).text()))
                        .priceFluctuation(convertData(fields.get(3).text()))
                        .volume(convertToFloat(fields.get(5).text()))
                        .openedPrice(Float.valueOf(fields.get(9).text()))
                        .highestPrice(Float.valueOf(fields.get(10).text()))
                        .lowestPrice(Float.valueOf(fields.get(11).text()))
                        .code(code)
                        .build();
        stockHistories.add(temp);
      } catch (Exception ex) {
      }
    }
    return stockHistories;
  }

  public static Float convertData(String input) {
    Pattern pattern = Pattern.compile("\\((-?\\d+\\.\\d+) %\\)");
    Matcher matcher = pattern.matcher(input);

    if (matcher.find()) {
      String percentage = matcher.group(1);
      return Float.valueOf(percentage);
    }
    return 0f;
  }

  public static Float convertToFloat(String input){
    try{
      String str = input.replace(",", "");
      return Float.valueOf(str);
    }catch (Exception e){
    }
    return 0f;
  }

}
