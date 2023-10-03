package com.example.ai.stock.domain.stock.processor;

import com.example.ai.stock.domain.stock.model.Stock;

import java.util.List;

public interface IStockProcessor {

  void enrichAverageData(List<Stock> stocks);
}
