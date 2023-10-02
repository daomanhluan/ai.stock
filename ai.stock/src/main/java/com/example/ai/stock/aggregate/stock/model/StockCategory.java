package com.example.ai.stock.aggregate.stock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockCategory {

  private Integer id;
  private String name;
  private String code;
  private String exchange;
  private LocalDateTime created;
  private LocalDateTime modified;
  private String field;
}
