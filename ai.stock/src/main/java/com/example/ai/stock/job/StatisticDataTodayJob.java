package com.example.ai.stock.job;

import com.example.ai.stock.common.constant.StockConstant;
import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.example.ai.stock.domain.stock.model.StockCategory;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.domain.stock.processor.IStockHistoryProcessor;
import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import com.example.ai.stock.infrastruture.repository.StockCategoryRepository;
import com.example.ai.stock.infrastruture.repository.StockHistoryRepository;
import com.example.ai.stock.service.BollingerBandService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@Slf4j
public class StatisticDataTodayJob {

  private final IStockHistoryProcessor iStockHistoryProcessor;
  private final StockCategoryRepository stockCategoryRepository;
  private final StockHistoryRepository stockHistoryRepository;
  private final BollingerBandService bollingerBandService;
  @Qualifier("threadPool1")
  @Autowired Executor threadPool;

  public void process(LocalDate fromDate) throws JsonProcessingException {
    log.info("========================StatisticDataTodayJob START==================================");
    Long start = System.currentTimeMillis();

    List<StockCategory> stockCategories =
        ModelMapperUtils.mapList(stockCategoryRepository.findAll(), StockCategory.class);
    for (StockCategory stockHistory : stockCategories) {
      if(StockConstant.ALL_CP.contains(stockHistory.getCode())){

        List<StockHistory> stockHistories =
                iStockHistoryProcessor.findByCode(stockHistory.getCode()).stream()
                        .sorted(Comparator.comparing(StockHistory::getDay))
                        .collect(Collectors.toList());
        List<StockHistory> finalStockHistories = new ArrayList<>(stockHistories);

        CompletableFuture.runAsync(()->iStockHistoryProcessor.enrichDataStatisticToday(finalStockHistories), threadPool).thenRun(()->{
          List<StockHistory> dataUpdateBB = finalStockHistories.stream().sorted(Comparator.comparing(StockHistory::getDay).reversed()).limit(50).collect(Collectors.toList());
          bollingerBandService.calculateBollingerBand(dataUpdateBB);
          List<StockHistory> dataUpdate = dataUpdateBB.stream().filter(e->e.getDay().isAfter(fromDate)).collect(Collectors.toList());
          stockHistoryRepository.saveAll(ModelMapperUtils.mapList(dataUpdate, StockHistoryEntity.class));
        });
      }
    }
    Long end = System.currentTimeMillis();
    log.info("========================StatisticDataTodayJob DONE=================================={}",end-start);
  }

}
