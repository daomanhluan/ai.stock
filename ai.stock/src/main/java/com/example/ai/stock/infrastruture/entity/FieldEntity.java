package com.example.ai.stock.infrastruture.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "field")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldEntity {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "code")
  private String code;

  @Column(name = "description")
  private String description;

  @Column(name = "created", insertable = false, updatable = false)
  private LocalDateTime created;

  @Column(name = "modified", insertable = false, updatable = false)
  private LocalDateTime modified;
}
