package com.example.ai.stock.service.filter;

import java.util.List;

public interface FilterPattern<T> {
  List<T> filter(List<T> data);
}
