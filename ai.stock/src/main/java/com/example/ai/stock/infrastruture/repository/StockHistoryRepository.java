package com.example.ai.stock.infrastruture.repository;

import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface StockHistoryRepository extends JpaRepository<StockHistoryEntity, Integer> {

  List<StockHistoryEntity> findByCode(String code);

  List<StockHistoryEntity> findByCodeIn(List<String> codes);

  List<StockHistoryEntity> findByCodeInAndDay(List<String> codes, LocalDate localDate);
}
