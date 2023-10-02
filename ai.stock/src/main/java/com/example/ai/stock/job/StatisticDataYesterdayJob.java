package com.example.ai.stock.job;

import com.example.ai.stock.aggregate.stock.model.StockCategory;
import com.example.ai.stock.aggregate.stock.model.StockHistory;
import com.example.ai.stock.aggregate.stock.processor.IStockHistoryProcessor;
import com.example.ai.stock.configuration.constant.StockConstant;
import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import com.example.ai.stock.infrastruture.repository.StockCategoryRepository;
import com.example.ai.stock.infrastruture.repository.StockHistoryRepository;
import com.example.ai.stock.service.utils.ModelMapperUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class StatisticDataYesterdayJob implements JobBackground {

  private final IStockHistoryProcessor iStockHistoryProcessor;
  private final StockCategoryRepository stockCategoryRepository;
  private final StockHistoryRepository stockHistoryRepository;

//  @EventListener(ApplicationReadyEvent.class)
  @Override
  public void process() throws JsonProcessingException {

    List<StockCategory> stockCategories =
        ModelMapperUtils.mapList(stockCategoryRepository.findAll(), StockCategory.class);
    for (StockCategory stockHistory : stockCategories) {
      if(!StockConstant.CHUNG_KHOAN.contains(stockHistory.getCode())) continue;
      List<StockHistory> stockHistories =
          iStockHistoryProcessor.findByCode(stockHistory.getCode()).stream()
              .sorted(Comparator.comparing(StockHistory::getDay))
              .collect(Collectors.toList());
      iStockHistoryProcessor.enrichDataStatisticYesterday(stockHistories);

      List<List<StockHistory>> partionsStockHistories = Lists.partition(stockHistories, 200);
      for (List<StockHistory> temp : partionsStockHistories) {
        stockHistoryRepository.saveAllAndFlush(
            ModelMapperUtils.mapList(temp, StockHistoryEntity.class));
      }
    }

    System.out.println("========================StatisticDataYesterdayJob DONE==================================");
  }

}
