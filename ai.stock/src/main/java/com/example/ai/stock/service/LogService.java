package com.example.ai.stock.service;

import com.example.ai.stock.common.enums.FilterStockEnum;
import com.example.ai.stock.domain.stock.model.Stock;
import com.example.ai.stock.domain.stock.model.global_config.ExplosiveDayOfStock;
import com.example.ai.stock.infrastruture.entity.AnalyseLogEntity;
import com.example.ai.stock.infrastruture.repository.AnalyseLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LogService {

  private final AnalyseLogRepository analyseLogRepository;
  private final GlobalConfigService globalConfigService;

  private Map<String, List<LocalDate>> codeWithDay = new HashMap<>();

  @PostConstruct
  public void init() {
    List<ExplosiveDayOfStock> config = globalConfigService.findExplosiveDayOfStock();
    codeWithDay =
        config.stream().collect(Collectors.toMap(e -> e.getCode(), e -> e.getExplosiveDays()));
  }

  public void saveLogStockExclude(List<Stock> stocks, FilterStockEnum enums) {
    if (stocks.isEmpty()) return;

    List<LocalDate> localDates = codeWithDay.getOrDefault(stocks.get(0).getCode(), new ArrayList<>());
    List<Stock> excludeStock = new ArrayList<>();
    switch (enums) {
      case BY_PRICE:
        {
          excludeStock =
              stocks.stream().filter(e -> !e.isChangePercentHigh()).collect(Collectors.toList());
          break;
        }
      case BY_VOLUME:
        {
          excludeStock =
              stocks.stream().filter(e -> !e.isBreakVolume()).collect(Collectors.toList());
          break;
        }
      case BREAK_MA:
        {
          excludeStock = stocks.stream().filter(e -> !e.isBreakMAs()).collect(Collectors.toList());
          break;
        }
    }

    List<AnalyseLogEntity> logs = new ArrayList<>();
    for (Stock stock : excludeStock) {
      if (localDates.contains(stock.getEvaluationDay())) {
        logs.add(
            AnalyseLogEntity.builder()
                .code(stock.getCode())
                .day(stock.getEvaluationDay())
                .reason(enums.toString())
                .build());
      }
    }
    analyseLogRepository.saveAll(logs);
  }
}
