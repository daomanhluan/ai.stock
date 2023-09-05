package com.example.ai.stock.service;

import com.example.ai.stock.client.TradingEconomyClient;
import com.example.ai.stock.model.Commodity;
import com.example.ai.stock.service.filter.CommodityFilter;
import com.example.ai.stock.utils.MapperUtils;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
@RequiredArgsConstructor
public class TradingEconomyService {

  private final TradingEconomyClient tradingEconomyClient;
  private HashSet<String> links = new HashSet<>();
  @Autowired private CommodityFilter commodityFilter;

//  @EventListener(ApplicationReadyEvent.class)
  public void test() {
    //    System.out.println(tradingEconomyClient.getInfoCommodities());
    getPageLinks("https://tradingeconomics.com/commodities#");
  }

  public void getPageLinks(String URL) {
    if (!links.contains(URL)) {
      try {
        if (links.add(URL)) {}
        Document document = Jsoup.connect(URL).get();
        Elements element1s = document.getElementsByClass("datatable-row");
        Elements element2s = document.getElementsByClass("datatable-row-alternating");

        List<Element> elements = new ArrayList<>();
        elements.addAll(element1s);
        elements.addAll(element2s);

        elements = commodityFilter.filter(elements);

        List<Commodity> commodities = MapperUtils.mapperToCommodity(elements);
        for (Commodity commodity : commodities) {
          System.out.println(commodity.toString());
        }
      } catch (IOException e) {
        System.err.println("For '" + URL + "': " + e.getMessage());
      }
    }
  }
}
