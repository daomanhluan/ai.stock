package com.example.ai.stock.infrastruture.feign_client;

import com.example.ai.stock.configuration.FeignUTF8Config;
import com.example.ai.stock.infrastruture.vo.StockHistoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "history-stock-scafef", url = "https://s.cafef.vn",configuration = FeignUTF8Config.class)
public interface ScafefClient {
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/Ajax/PageNew/DataHistory/PriceHistory.ashx",
      consumes = "text/plain;charset=utf-8")
  StockHistoryResponse getStockHistory(
      @RequestParam("Symbol") String symbol,
      @RequestParam("PageIndex") Integer pageIndex,
      @RequestParam("PageSize") Integer pageSize);
}
