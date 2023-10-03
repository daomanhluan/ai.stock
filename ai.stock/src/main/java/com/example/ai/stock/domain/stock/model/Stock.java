package com.example.ai.stock.domain.stock.model;

import com.example.ai.stock.configuration.constant.GlobalConstant;
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
  private String code;
  private Integer volumeEvaluation;
  private Float changePercent;
  private Float priceEvaluation;

  private AverageDataStatistic baseData;
  private LocalDate evaluationDay;

  /*
   * Thong tin sau khi danh gia
   *
   * */
  private Integer averageVolume10Day;
  private Integer averageVolume20Day;
  private Integer averageVolume50Day;
  private Float rateVolume10Day;
  private Float rateVolume20Day;
  private Float averagePrice10Day;
  private Float averagePrice20Day;

  public boolean isBreakVolume() {
    AverageDataStatistic baseData = this.getBaseData();
    Integer averageVolume10Day = baseData.getAverageVolume10Day();
    Integer averageVolume20Day = baseData.getAverageVolume20Day();

    Integer evaluationVolume = this.getVolumeEvaluation();

    Float volumeRate10Day = (float) (evaluationVolume / averageVolume10Day);
    Float volumeRate20Day = (float) (evaluationVolume / averageVolume20Day);

    if (volumeRate10Day > GlobalConstant.VOLUME_RATE_10_DAY_EXPECT
        && volumeRate20Day > GlobalConstant.VOLUME_RATE_20_DAY_EXPECT) {
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
    if (newAveragePrice10Day > baseData.getAveragePrice20Day()
        && newAveragePrice10Day > baseData.getLastPrice50Day()
        && newAveragePrice20Day > baseData.getAveragePrice50ay()) {
      return true;
    }
    return false;
  }
}
