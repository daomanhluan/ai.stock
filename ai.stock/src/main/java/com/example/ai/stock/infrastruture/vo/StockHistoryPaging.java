package com.example.ai.stock.infrastruture.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class StockHistoryPaging {
  @JsonProperty("TotalCount")
  private Integer TotalCount;
  @JsonProperty("Data")
  private List<StockInfoV2> Data;
}
