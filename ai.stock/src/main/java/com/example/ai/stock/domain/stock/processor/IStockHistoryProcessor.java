package com.example.ai.stock.domain.stock.processor;

import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;

import java.time.LocalDate;
import java.util.List;

public interface IStockHistoryProcessor {

  List<StockHistory> findByCode(String code);
  List<StockHistory> findByCodesAndDay(List<String> code, LocalDate date);

  void enrichDataStatisticToday(List<StockHistory> stockHistories);

  List<StockHistoryEntity> findByIds(List<Integer> ids);
  void enrichAveragePrice10Day(List<StockHistory> stockHistories);

  void enrichAveragePrice20Day(List<StockHistory> stockHistories);

  void enrichAveragePrice50Day(List<StockHistory> stockHistories);

  void enrichAveragePrice100Day(List<StockHistory> stockHistories);

  void enrichAveragePrice200Day(List<StockHistory> stockHistories);
  void saveAll(List<StockHistoryEntity> stockHistoryEntities);
}
