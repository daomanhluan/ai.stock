package com.example.ai.stock.infrastruture.repository;

import com.example.ai.stock.infrastruture.entity.StockCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockCategoryRepository extends JpaRepository<StockCategoryEntity, Integer> {}
