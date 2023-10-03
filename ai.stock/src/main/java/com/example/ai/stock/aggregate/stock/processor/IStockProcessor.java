package com.example.ai.stock.aggregate.stock.processor;

import com.example.ai.stock.aggregate.stock.model.Stock;

import java.util.List;

public interface IStockProcessor {

  void enrichAverageData(List<Stock> stocks);
}
