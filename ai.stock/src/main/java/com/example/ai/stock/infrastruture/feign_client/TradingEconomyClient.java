package com.example.ai.stock.infrastruture.feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "trading-economy", url = "${trading-economy-host}")
public interface TradingEconomyClient {

  @RequestMapping(
      method = RequestMethod.GET,
      value = "${trading-economy-commodities}",
      consumes = MediaType.APPLICATION_JSON_VALUE)
  String getInfoCommodities();
}
