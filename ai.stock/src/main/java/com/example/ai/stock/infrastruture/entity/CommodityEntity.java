package com.example.ai.stock.infrastruture.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "commodity")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommodityEntity {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "price")
  private Float price;

  @Column(name = "fluctuate_percent_in_day")
  private Float fluctuatePercentInDay;

  @Column(name = "fluctuate_percent_in_week")
  private Float fluctuatePercentInWeek;

  @Column(name = "fluctuate_percent_in_month")
  private Float fluctuatePercentInMonth;

  @Column(name = "created", insertable = false, updatable = false)
  private LocalDateTime created;

  @Column(name = "modified", insertable = false, updatable = false)
  private LocalDateTime modified;
}
