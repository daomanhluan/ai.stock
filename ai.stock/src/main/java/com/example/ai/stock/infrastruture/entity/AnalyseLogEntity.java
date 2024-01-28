package com.example.ai.stock.infrastruture.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "analyse_log")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnalyseLogEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "code")
  private String code;

  @Column(name = "day")
  private LocalDate day;

  @Column(name = "reason")
  private String reason;

  @Column(name = "created", insertable = false, updatable = false)
  private LocalDateTime created;

  @Column(name = "modified", insertable = false, updatable = false)
  private LocalDateTime modified;
}
