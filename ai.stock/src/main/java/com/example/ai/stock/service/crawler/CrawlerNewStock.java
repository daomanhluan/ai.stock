package com.example.ai.stock.service.crawler;

import com.example.ai.stock.common.constant.GlobalConstant;
import com.example.ai.stock.common.constant.StockConstant;
import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.infrastruture.entity.StockCategoryEntity;
import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import com.example.ai.stock.infrastruture.feign_client.ScafefClient;
import com.example.ai.stock.infrastruture.repository.StockCategoryRepository;
import com.example.ai.stock.infrastruture.repository.StockHistoryRepository;
import com.example.ai.stock.infrastruture.vo.StockHistoryResponse;
import com.example.ai.stock.service.filter.StockFilter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CrawlerNewStock implements CrawlerData {

  private final Integer TOTAL_PAGE = 200;
  private final StockFilter stockFilter;
  private final StockHistoryRepository stockHistoryRepository;
  private final StockCategoryRepository stockCategoryRepository;
  private final ScafefClient scafefClient;

  @Value("${cafef-host-lich-su-gia}")
  private String URL_API;

//  @EventListener(ApplicationReadyEvent.class)
  @Override
  public void crawl() throws InterruptedException {
    System.out.println(
        "=====================================StockHistoryCrawler START=====================================");
    String stockCode = "VNINDEX";
    Integer page = 1;
    while(page  < TOTAL_PAGE){
        List<StockHistory> stockHistories = getStockHistory(stockCode, page);
        saveDB(stockHistories);
        page++;
    }
    System.out.println(
        "=====================================StockHistoryCrawler FINISH=====================================");
  }

  private void saveDB(List<StockHistory> stockHistories) {
    if (stockHistories.isEmpty()) return;
    try {
      stockHistoryRepository.saveAllAndFlush(
          ModelMapperUtils.mapList(stockHistories, StockHistoryEntity.class));
    } catch (Exception e) {
      log.error("Exception ===saveDB: {} {}", e, stockHistories.get(0).getCode());
    }
  }

  private List<StockHistory> getStockHistory(String code, Integer page) {
    StockHistoryResponse response = scafefClient.getStockHistory(code, page, 20);
    if (response.isSuccess()) {
      return response.getData().getData().stream()
          .map(
              e ->
                  StockHistory.builder()
                      .code(code)
                      .highestPrice(e.getGiaCaoNhat())
                      .lowestPrice(e.getGiaThapNhat())
                      .closedPrice(e.getGiaDongCua())
                      .openedPrice(e.getGiaMoCua())
                      .volume(e.getKhoiLuongKhopLenh())
                      .priceFluctuation(toFloat(e.getThayDoi()))
                      .day(e.getNgay())
                      .build())
          .collect(Collectors.toList());
    }
    return Collections.emptyList();
  }

  private Float toFloat(String s) {
    String result = s.substring(s.indexOf("(") + 1, s.indexOf(")"));
    try {
      return Float.parseFloat(result.substring(0, result.length() - 1));
    } catch (Exception e) {

    }
    return 0f;
  }
}
