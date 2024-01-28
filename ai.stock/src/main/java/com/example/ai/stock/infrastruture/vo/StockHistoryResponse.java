package com.example.ai.stock.infrastruture.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockHistoryResponse {
    @JsonProperty("Success")
    private boolean Success;
    @JsonProperty("Message")
    private String Message;
    @JsonProperty("Data")
    private StockHistoryPaging Data;
}
