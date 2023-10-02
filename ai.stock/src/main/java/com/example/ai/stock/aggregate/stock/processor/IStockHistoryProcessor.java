package com.example.ai.stock.aggregate.stock.processor;

import com.example.ai.stock.aggregate.stock.model.StockHistory;

import java.util.List;

public interface IStockHistoryProcessor {

  List<StockHistory> findByCode(String code);

  void enrichDataStatisticYesterday(List<StockHistory> stockHistories);

  void enrichDataStatisticToday(List<StockHistory> stockHistories);

  void enrichAveragePrice10Day(List<StockHistory> stockHistories);

  void enrichAveragePrice20Day(List<StockHistory> stockHistories);

  void enrichAveragePrice50Day(List<StockHistory> stockHistories);

  void enrichAveragePrice100Day(List<StockHistory> stockHistories);

  void enrichAveragePrice200Day(List<StockHistory> stockHistories);
}
