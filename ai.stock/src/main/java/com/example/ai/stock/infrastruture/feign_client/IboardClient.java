package com.example.ai.stock.infrastruture.feign_client;

import com.example.ai.stock.infrastruture.request.GetStockInfoRequest;
import com.example.ai.stock.infrastruture.response.StockInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "info-stock", url = "${iboard-ssi-host}")
public interface IboardClient {
  @RequestMapping(
      method = RequestMethod.POST,
      value = "${iboard-ssi-stock-info}",
      consumes = MediaType.APPLICATION_JSON_VALUE)
  StockInfoResponse getStockHistory(@RequestBody GetStockInfoRequest request);
}
