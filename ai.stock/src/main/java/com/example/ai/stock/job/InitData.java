package com.example.ai.stock.job;

import com.example.ai.stock.common.utils.DateTimeUtils;
import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.example.ai.stock.controller.request.SyncStockHistoryReq;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.infrastruture.repository.StockHistoryRepository;
import com.example.ai.stock.service.StockHistoryService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class InitData {

  private final StockHistoryService stockHistoryService;
  private final StockHistoryRepository stockHistoryRepository;

  @PostConstruct
  public void init() throws JsonProcessingException, InterruptedException {
    List<StockHistory> stockHistorys =
        ModelMapperUtils.mapList(stockHistoryRepository.findStockLatest(), StockHistory.class);
    LocalDate latestDay = stockHistorys.get(0).getDay();

    LocalDate currentDay = LocalDate.now();

    if (Objects.equals(latestDay, currentDay)) return;
    if (DateTimeUtils.isFriday(latestDay)
        && (latestDay.plusDays(2).equals(currentDay) || latestDay.plusDays(2).isAfter(currentDay)))
      return;
    stockHistoryService.syncStockHistory(SyncStockHistoryReq.builder().fromDate(latestDay).build());
  }
}
