package com.example.ai.stock.domain.stock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockFollow {
  private Integer id;
  private String code;
  private Integer active;
  private String extraInfo;
  private LocalDateTime created;
  private LocalDateTime modified;
}
