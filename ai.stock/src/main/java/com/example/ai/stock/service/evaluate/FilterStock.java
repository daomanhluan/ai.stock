package com.example.ai.stock.service.evaluate;

import com.example.ai.stock.aggregate.stock.model.Stock;

import java.util.List;

public interface FilterStock {
  List<Stock> filter(List<Stock> stocks);
}
