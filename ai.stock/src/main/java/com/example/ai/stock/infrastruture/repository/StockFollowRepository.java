package com.example.ai.stock.infrastruture.repository;

import com.example.ai.stock.infrastruture.entity.StockFollowEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StockFollowRepository extends JpaRepository<StockFollowEntity, Integer> {

    @Query(value = "select * from stock_follow where active = 1", nativeQuery = true)
    List<StockFollowEntity> findStockFollowActive();

    Optional<StockFollowEntity> findByCode(String code);
}
