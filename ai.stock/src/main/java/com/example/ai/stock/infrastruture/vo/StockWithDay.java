package com.example.ai.stock.infrastruture.vo;

import java.time.LocalDate;

public interface StockWithDay {
    String getCode();
    LocalDate getDay();
    Integer getCount();
}
