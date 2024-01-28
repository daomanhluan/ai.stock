package com.example.ai.stock.infrastruture.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "global_config")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GlobalConfigEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "code")
  private String code;

  /*
  * format json
  * */
  @Column(name = "value")
  private String value;

  @Column(name = "description")
  private String desc;

  @Column(name = "created", insertable = false, updatable = false)
  private LocalDateTime created;

  @Column(name = "modified", insertable = false, updatable = false)
  private LocalDateTime modified;
}
