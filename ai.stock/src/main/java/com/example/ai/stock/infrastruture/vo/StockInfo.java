package com.example.ai.stock.infrastruture.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class StockInfo {
  private String stockSymbol;
  private Float openPrice;
  private Float highest;
  private Float priceChangePercent;
  private Float lowest;
  private Float matchedPrice;
  private Integer totalShare;
}
