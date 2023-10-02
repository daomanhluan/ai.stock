package com.example.ai.stock.infrastruture.repository;

import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockHistoryRepository extends JpaRepository<StockHistoryEntity, Integer> {

    List<StockHistoryEntity> findByCode(String code);
}
