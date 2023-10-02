package com.example.ai.stock.infrastruture.feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "history-stock", url = "${cafef-host}")
public interface CafefClient {
  @RequestMapping(
      method = RequestMethod.POST,
      value = "${lich-su-gia}/{param}",
      consumes = MediaType.APPLICATION_JSON_VALUE)
  String getStockHistory(@PathVariable String param, String request);
}
