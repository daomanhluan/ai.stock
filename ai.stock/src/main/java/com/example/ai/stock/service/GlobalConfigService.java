package com.example.ai.stock.service;

import com.example.ai.stock.common.constant.GlobalConfig;
import com.example.ai.stock.domain.stock.model.global_config.ExplosiveDayOfStock;
import com.example.ai.stock.infrastruture.entity.GlobalConfigEntity;
import com.example.ai.stock.infrastruture.repository.GlobalConfigRepository;
import com.example.ai.stock.common.utils.JsonUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Component
@Slf4j
public class GlobalConfigService {

  private final GlobalConfigRepository globalConfigRepository;

  public List<ExplosiveDayOfStock> findExplosiveDayOfStock() {
    GlobalConfigEntity globalConfigEntity =
        globalConfigRepository.findByCode(GlobalConfig.EXPLOSIVE_DAYS);
    if (Objects.isNull(globalConfigEntity)) return Collections.emptyList();
    String value = globalConfigEntity.getValue();
    try {
      return JsonUtils.map(value, new TypeReference<>() {});
    } catch (Exception e) {
      log.error("Exception: {}",e);
    }
    return new ArrayList<>();
  }

}
