package com.example.ai.stock.domain.stock.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockHistory {
  private Integer id;
  private String code;
  private Float openedPrice;
  private Float highestPrice;
  private Float lowestPrice;

  private Float closedPrice;
  private Integer volume;
  private Float priceFluctuation;
  private String dataStatisticToday;
  private String dataStatisticYesterday;

  @JsonFormat(pattern="dd-MM-yyyy")
  private LocalDate day;

  @JsonFormat(pattern="HH:mm:ss dd-MM-yyyy")
  private LocalDateTime created;

  @JsonFormat(pattern="HH:mm:ss dd-MM-yyyy")
  private LocalDateTime modified;

  private AverageDataStatistic averageDataStatisticYesterday;
  private AverageDataStatistic averageDataStatisticToday;
}
