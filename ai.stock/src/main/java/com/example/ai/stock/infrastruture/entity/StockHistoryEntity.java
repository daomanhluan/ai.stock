package com.example.ai.stock.infrastruture.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "stock_history")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockHistoryEntity {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "code")
  private String code;

  @Column(name = "opened_price")
  private Float openedPrice;

  @Column(name = "highest_price")
  private Float highestPrice;

  @Column(name = "lowest_price")
  private Float lowestPrice;

  @Column(name = "closed_price")
  private Float closedPrice;

  @Column(name = "volume")
  private Integer volume;

  @Column(name = "price_fluctuation")
  private Float priceFluctuation;

  @Column(name = "data_statistic_today")
  private String dataStatisticToday;

  @Column(name = "data_statistic_yesterday")
  private String dataStatisticYesterday;

  @Column(name = "day")
  private LocalDate day;

  @Column(name = "created", insertable = false, updatable = false)
  private LocalDateTime created;

  @Column(name = "modified", insertable = false, updatable = false)
  private LocalDateTime modified;
}
