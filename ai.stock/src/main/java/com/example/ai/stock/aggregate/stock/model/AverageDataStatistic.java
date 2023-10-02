package com.example.ai.stock.aggregate.stock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

  private Float lastPrice10Day;
  private Float lastPrice20Day;
  private Float lastPrice50Day;
  private Float lastPrice100Day;
  private Float lastPrice200Day;

  private Integer averageVolume10Day;
  private Integer averageVolume20Day;
  private Integer averageVolume50Day;
  private Integer averageVolume100Day;
  private Integer averageVolume200Day;

  private Integer lastVolume10Day;
  private Integer lastVolume20Day;
  private Integer lastVolume50Day;
  private Integer lastVolume100Day;
  private Integer lastVolume200Day;

  private long moneyInDay;
}
