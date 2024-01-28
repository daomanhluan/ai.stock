package com.example.ai.stock.service.crawler;

import com.example.ai.stock.common.constant.GlobalConstant;
import com.example.ai.stock.common.utils.JsonUtils;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.common.constant.StockConstant;
import com.example.ai.stock.infrastruture.entity.StockCategoryEntity;
import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import com.example.ai.stock.infrastruture.feign_client.ScafefClient;
import com.example.ai.stock.infrastruture.repository.StockCategoryRepository;
import com.example.ai.stock.infrastruture.repository.StockHistoryRepository;
import com.example.ai.stock.infrastruture.vo.StockHistoryResponse;
import com.example.ai.stock.service.filter.StockFilter;
import com.example.ai.stock.common.utils.MapperUtils;
import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class StockHistoryCrawler{

  private final Integer TOTAL_PAGE = 1;
  private final StockFilter stockFilter;
  private final StockHistoryRepository stockHistoryRepository;
  private final StockCategoryRepository stockCategoryRepository;
  private final ScafefClient scafefClient;
  @Value("${cafef-host-lich-su-gia}")
  private String URL_API;

  public void crawl(LocalDate fromDate) throws InterruptedException, JsonProcessingException {
    System.out.println(
        "=====================================StockHistoryCrawler START=====================================");
    LocalDate FROM_AT = fromDate;
    List<StockCategoryEntity> stockCategoryEntities = stockCategoryRepository.findAll();

    for (StockCategoryEntity stockCategoryEntity : stockCategoryEntities) {
      String stockCode = stockCategoryEntity.getCode();
      if (StockConstant.ALL_CP.contains(stockCode)) {
        List<StockHistory> stockHistories =
            getStockHistory(stockCode);
        stockHistories = stockHistories.stream().filter(e->e.getDay().isAfter(FROM_AT)).collect(Collectors.toList());
        saveDB(stockHistories);
      }
    }
    System.out.println(
        "=====================================StockHistoryCrawler FINISH=====================================");
  }



  private void saveDB(List<StockHistory> stockHistories) throws JsonProcessingException {
    if (stockHistories.isEmpty()) return;
    try {
      stockHistoryRepository.saveAllAndFlush(
          ModelMapperUtils.mapList(stockHistories, StockHistoryEntity.class));
    } catch (Exception e) {
      log.info("stockHistories fail: {}", JsonUtils.toJson(stockHistories));
      log.error("Exception ===saveDB: {} {}", e, stockHistories.get(0).getCode());
    }
  }


  private List<StockHistory> getStockHistory(String code){
    StockHistoryResponse response = scafefClient.getStockHistory(code,1,30);
    if(response.isSuccess()){
        return response.getData().getData().stream().map(e->StockHistory.builder()
                .code(code)
                .highestPrice(e.getGiaCaoNhat())
                .lowestPrice(e.getGiaThapNhat())
                .closedPrice(e.getGiaDongCua())
                .openedPrice(e.getGiaMoCua())
                .volume(e.getKhoiLuongKhopLenh())
                .priceFluctuation(toFloat(e.getThayDoi()))
                .day(e.getNgay())
                .build()).collect(Collectors.toList());
    }
    return Collections.emptyList();
  }

  private Float toFloat(String s){
    String result = s.substring(s.indexOf("(") + 1, s.indexOf(")"));
    try{
       return Float.parseFloat(result.substring(0,result.length()-1));
    }catch (Exception e){

    }
    return  0f;
  }
}
