package com.example.ai.stock.domain.stock.model;

import com.example.ai.stock.common.constant.GlobalConstant;
import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.example.ai.stock.common.utils.NumberUtils;
import com.example.ai.stock.controller.dto.StockHistoryDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockHistory {
  private Integer id;
  private String code;

  @JsonFormat(pattern = "dd-MM-yyyy")
  private LocalDate day;

  private Float openedPrice;
  private Float highestPrice;
  private Float lowestPrice;

  private Float closedPrice;
  private Float volume;
  private Float priceFluctuation;
  private String dataStatisticToday;
  private String dataStatisticYesterday;
  private Float pointToBuy;

  @JsonFormat(pattern = "HH:mm:ss dd-MM-yyyy")
  private LocalDateTime created;

  @JsonFormat(pattern = "HH:mm:ss dd-MM-yyyy")
  private LocalDateTime modified;

  private AverageDataStatistic averageDataStatisticYesterday;
  private AverageDataStatistic averageDataStatisticToday;

  private Float rateVolume10Day;
  private Float rateVolume20Day;
  private Float rateVolume50Day;

  private boolean ceilingPrice;
  private StockFollow stockFollow;
  private BollingerBand bollingerBand;
  private String bollingerBandStr;

  public StockHistoryDTO toDTO() {
    StockHistoryDTO st = ModelMapperUtils.mapper(this, StockHistoryDTO.class);
    st.setStockFollow(isStockFollow());
    return st;
  }

  public boolean isStockFollow(){
    if(Objects.isNull(stockFollow)) return false;
    return Objects.equals(this.stockFollow.getActive(), 1);
  }
  public Float getRateVolume10Day() {
    if (Objects.isNull(this.averageDataStatisticToday)) return 0f;
    return NumberUtils.round(
        this.volume / this.getAverageDataStatisticToday().getAverageVolume10Day());
  }

  public Float getRateVolume20Day() {
    if (Objects.isNull(this.averageDataStatisticToday)) return 0f;
    return NumberUtils.round(
        this.volume / this.getAverageDataStatisticToday().getAverageVolume20Day());
  }

  public Float getRateVolume50Day() {
    if (Objects.isNull(this.averageDataStatisticToday)) return 0f;
    return NumberUtils.round(
        this.volume / this.getAverageDataStatisticToday().getAverageVolume50Day());
  }

  public boolean isCeilingPrice() {
    return Objects.equals(this.closedPrice, this.highestPrice)
        && ((this.getPriceFluctuation() > 6.8f && this.getPriceFluctuation() < 7.01f)
            || this.getPriceFluctuation() > 9.8f);
  }

  public boolean isBreakVolume() {
    if (Objects.isNull(this.averageDataStatisticToday)) return false;
    if (this.volume < GlobalConstant.MIN_VOLUME) return false;
    AverageDataStatistic baseData = this.averageDataStatisticToday;
    Float averageVolume10Day = baseData.getAverageVolume10Day();
    Float averageVolume20Day = baseData.getAverageVolume20Day();

    Float evaluationVolume = Float.valueOf(this.volume);

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
    return this.priceFluctuation > GlobalConstant.PRICE_CHANGE_PERCENT;
  }

  public boolean isBreakMAs() {
    if (Objects.isNull(this.averageDataStatisticToday)) return false;

    AverageDataStatistic baseData = this.averageDataStatisticToday;
    Float newAveragePrice10Day =
        (baseData.getAveragePrice10Day() * 10
                + this.priceFluctuation
                - baseData.getLastPrice10Day())
            / 10;
    Float newAveragePrice20Day =
        (baseData.getAveragePrice20Day() * 20
                + this.priceFluctuation
                - baseData.getLastPrice20Day())
            / 20;
    if (newAveragePrice10Day >= (baseData.getAveragePrice20Day() * 0.9)
        && newAveragePrice20Day >= (baseData.getAveragePrice50ay() * 0.9)) {
      return true;
    }
    return false;
  }
}
