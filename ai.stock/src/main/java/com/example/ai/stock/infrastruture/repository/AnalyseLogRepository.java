package com.example.ai.stock.infrastruture.repository;

import com.example.ai.stock.infrastruture.entity.AnalyseLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalyseLogRepository extends JpaRepository<AnalyseLogEntity, Integer> {}
