package com.example.ai.stock.service.crawler;

import com.example.ai.stock.common.constant.StockConstant;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.infrastruture.feign_client.IboardClient;
import com.example.ai.stock.infrastruture.request.GetStockInfoRequest;
import com.example.ai.stock.infrastruture.response.StockInfoResponse;
import com.example.ai.stock.infrastruture.vo.StockInfo;
import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CrawlerDataRealTime {

  private final IboardClient iboardClient;

//  @EventListener(ApplicationReadyEvent.class)
  public void test() {
    List<String> stocks = StockConstant.ALL_CP;
    List<List<String>> partitionStock = Lists.partition(stocks, 20);
    for (List<String> par : partitionStock) {
      StockInfoResponse stockInfoResponse =
          iboardClient.getStockHistory(GetStockInfoRequest.builder().stocks(par).build());
      String successCode = stockInfoResponse.getCode();
      if(Objects.equals(successCode, "SUCCESS")){
        List<StockInfo> stockInfos = stockInfoResponse.getData();
        for(StockInfo stockInfo:stockInfos){
          StockHistory.builder()
                  .code(stockInfo.getStockSymbol())
                  .openedPrice(stockInfo.getOpenPrice())
                  .highestPrice(stockInfo.getHighest())
//                  .closedPrice(stockInfo.get)
                  .build();
        }
      }
    }
  }
}
