package com.example.ai.stock.repository;

import com.example.ai.stock.entity.StockCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<StockCategoryEntity, Integer> {}
