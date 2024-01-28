package com.example.ai.stock.domain.stock.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AverageDataStatistic {

  /*
   *  Lưu thông tin dữ liệu trung bình 10,20,.. về giá và khối lượng
   *
   * */

  private Float averagePrice10Day;
  private Float averagePrice20Day;
  private Float averagePrice50ay;
  private Float averagePrice100Day;
  private Float averagePrice200Day;

  private Float lastPrice10Day = 0f;
  private Float lastPrice20Day = 0f;
  private Float lastPrice50Day = 0f;
  private Float lastPrice100Day = 0f;
  private Float lastPrice200Day = 0f;

  private Float averageVolume10Day;
  private Float averageVolume20Day;
  private Float averageVolume50Day;
  private Float averageVolume100Day;
  private Float averageVolume200Day;

  private Float lastVolume10Day = 0f;
  private Float lastVolume20Day = 0f;
  private Float lastVolume50Day = 0f;
  private Float lastVolume100Day = 0f;
  private Float lastVolume200Day = 0f;

  private long moneyInDay;
}
