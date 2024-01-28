package com.example.ai.stock.business.filter;

import com.example.ai.stock.domain.stock.model.StockHistory;

import java.util.List;

public interface FilterStock {
  List<StockHistory> filter(List<StockHistory> stocks);
}
