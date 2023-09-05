package com.example.ai.stock.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockInfoTemp {
  private String stockNo;
  private String exchange;
  private String stockSymbol;
}
