package com.example.ai.stock.domain.stock.model.global_config;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExplosiveDayOfStock {
  private String code;

  @JsonProperty("explosive_days")
  @JsonFormat(pattern = "dd/MM/yyyy")
  private List<LocalDate> explosiveDays;
}
