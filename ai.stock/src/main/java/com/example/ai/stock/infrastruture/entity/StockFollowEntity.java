package com.example.ai.stock.infrastruture.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "stock_follow")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockFollowEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "active")
    private Integer active;

    @Column(name = "extra_info")
    private String extraInfo;

    @Column(name = "created", insertable = false, updatable = false)
    private LocalDateTime created;

    @Column(name = "modified", insertable = false, updatable = false)
    private LocalDateTime modified;
}
