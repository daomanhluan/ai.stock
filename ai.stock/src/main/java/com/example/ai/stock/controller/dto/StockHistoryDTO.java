package com.example.ai.stock.controller.dto;

import com.example.ai.stock.domain.stock.model.AverageDataStatistic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StockHistoryDTO {
    private Integer id;
    private String code;
    private Float openedPrice;
    private Float highestPrice;
    private Float lowestPrice;

    private Float closedPrice;
    private Float volume;
    private Float priceFluctuation;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate day;
    private Float pointToBuy;

    private AverageDataStatistic averageDataStatisticYesterday;
    private AverageDataStatistic averageDataStatisticToday;

    private Float rateVolume10Day;
    private Float rateVolume20Day;
    private Float rateVolume50Day;
    private boolean ceilingPrice;

    private boolean stockFollow;
}
