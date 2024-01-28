package com.example.ai.stock.job;

import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import com.example.ai.stock.infrastruture.repository.StockHistoryRepository;
import com.example.ai.stock.infrastruture.vo.StockWithDay;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClearDataDuplicate implements JobBackground {

  private final StockHistoryRepository stockHistoryRepository;

  @Override
  public void process() throws JsonProcessingException {
    LocalDate day = LocalDate.of(2023, 10, 01);

    List<StockWithDay> stockWithDays = stockHistoryRepository.findDataDuplicate(day);

    List<StockHistory> dataDuplicate = new ArrayList<>();
    for (StockWithDay st : stockWithDays) {
      log.info("st: {} {}", st.getCode(), st.getDay());
      List<StockHistory> stockHistories =
          ModelMapperUtils.mapList(
              stockHistoryRepository.findByCodeAndDay(st.getCode(), st.getDay()),
              StockHistory.class);

      for (int i = 1; i < stockHistories.size(); i++) {
        dataDuplicate.add(stockHistories.get(i));
      }
    }
    stockHistoryRepository.deleteAll(
        ModelMapperUtils.mapList(dataDuplicate, StockHistoryEntity.class));
  }
}
