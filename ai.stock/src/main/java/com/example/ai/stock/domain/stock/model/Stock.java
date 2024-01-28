package com.example.ai.stock.domain.stock.model;

import com.example.ai.stock.common.constant.GlobalConstant;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
  private Integer id;
  private String code;
  private Integer volumeEvaluation;
  private Float changePercent;
  private Float priceEvaluation;

  private AverageDataStatistic baseData;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate evaluationDay;

  /*
   * Thong tin sau khi danh gia
   *
   * */
  private Float averageVolume10Day;
  private Float averageVolume20Day;
  private Float averageVolume50Day;
  private Float rateVolume10Day;
  private Float rateVolume20Day;
  private Float averagePrice10Day;
  private Float averagePrice20Day;
  private Float pointToBuy;

  public boolean isBreakVolume() {
    if (this.getVolumeEvaluation() < GlobalConstant.MIN_VOLUME) return false;
    AverageDataStatistic baseData = this.getBaseData();
    Float averageVolume10Day = baseData.getAverageVolume10Day();
    Float averageVolume20Day = baseData.getAverageVolume20Day();

    Float evaluationVolume = Float.valueOf(this.getVolumeEvaluation());

    Float volumeRate10Day = (evaluationVolume / averageVolume10Day);
    Float volumeRate20Day = (evaluationVolume / averageVolume20Day);

    if (volumeRate10Day > GlobalConstant.VOLUME_RATE_10_DAY_EXPECT
        && volumeRate20Day > GlobalConstant.VOLUME_RATE_20_DAY_EXPECT) {
      this.pointToBuy = (volumeRate10Day + volumeRate20Day) / 2;
      return true;
    }
    return false;
  }

  public boolean isChangePercentHigh() {
    return this.changePercent > GlobalConstant.PRICE_CHANGE_PERCENT;
  }

  public boolean isBreakMAs() {
    AverageDataStatistic baseData = this.getBaseData();
    Float newAveragePrice10Day =
        (baseData.getAveragePrice10Day() * 10
                + this.getPriceEvaluation()
                - baseData.getLastPrice10Day())
            / 10;
    Float newAveragePrice20Day =
        (baseData.getAveragePrice20Day() * 20
                + this.getPriceEvaluation()
                - baseData.getLastPrice20Day())
            / 20;
    if (newAveragePrice10Day >= (baseData.getAveragePrice20Day() * 0.9)
        && newAveragePrice20Day >= (baseData.getAveragePrice50ay() * 0.9)) {
      return true;
    }
    return false;
  }
}
