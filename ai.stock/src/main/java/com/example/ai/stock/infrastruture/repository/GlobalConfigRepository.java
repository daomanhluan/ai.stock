package com.example.ai.stock.infrastruture.repository;

import com.example.ai.stock.infrastruture.entity.GlobalConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlobalConfigRepository extends JpaRepository<GlobalConfigEntity, Integer> {

  GlobalConfigEntity findByCode(String code);
}
