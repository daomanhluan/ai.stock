package com.example.ai.stock.domain.commodity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Commodity {
  private String name;
  private Float price;
  private Float fluctuatePercentInDay;
  private Float fluctuatePercentInWeek;
  private Float fluctuatePercentInMonth;
}
