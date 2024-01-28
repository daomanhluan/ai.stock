package com.example.ai.stock.service;

import com.example.ai.stock.business.filter.CompositeHotStockTodayFilter;
import com.example.ai.stock.common.utils.JsonUtils;
import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.example.ai.stock.controller.dto.StockHistoryDTO;
import com.example.ai.stock.controller.request.FindStockBreakMA50Req;
import com.example.ai.stock.controller.request.FindStockByCodeReq;
import com.example.ai.stock.controller.request.SyncStockHistoryReq;
import com.example.ai.stock.controller.response.ObjectRecord;
import com.example.ai.stock.domain.stock.model.BollingerBand;
import com.example.ai.stock.domain.stock.model.StockFollow;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.infrastruture.entity.StockFollowEntity;
import com.example.ai.stock.infrastruture.repository.StockFollowRepository;
import com.example.ai.stock.infrastruture.repository.StockHistoryRepository;
import com.example.ai.stock.job.StatisticDataTodayJob;
import com.example.ai.stock.service.crawler.StockHistoryCrawler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
@Slf4j
public class StockHistoryService {

  private final StockHistoryRepository stockHistoryRepository;

  private final CompositeHotStockTodayFilter filterStock;
  private final StatisticDataTodayJob statisticDataTodayJob;
  private final StockHistoryCrawler stockHistoryCrawler;
  private final StockFollowRepository stockFollowRepository;
  private final EnrichService enrichService;
  public ObjectRecord<List<StockHistoryDTO>> findStockBreakMA50(FindStockBreakMA50Req req) {
    Pageable pageable = PageRequest.of(req.getPage() - 1, req.getSize());

    Page<StockHistory> stockHistoryPage =
        ModelMapperUtils.mapPage(
            stockHistoryRepository.findStockBreakMA50(req.getDay(), pageable), StockHistory.class);
    List<StockHistory> stockHistories = stockHistoryPage.getContent();
    enrichAverageDataStatistic(stockHistories);

    return ObjectRecord.<List<StockHistoryDTO>>builder()
        .total(stockHistoryPage.getTotalElements())
        .records(stockHistories.stream().map(e -> e.toDTO()).collect(Collectors.toList()))
        .build();
  }

  public ObjectRecord<List<StockHistoryDTO>> findHotStockToday(FindStockBreakMA50Req req) {

    List<StockHistory> stockHistories =
        ModelMapperUtils.mapList(
            stockHistoryRepository.findHotStockToday(req.getDay()), StockHistory.class);
    enrichAverageDataStatistic(stockHistories);
    List<StockHistory> stockPassFilter = filterStock.filter(stockHistories);
    enrichExtraInfo(stockPassFilter);

    enrichService.enrichStockFollow(stockPassFilter);

    List<StockHistoryDTO> stockHistoryDTOS =
        stockPassFilter.stream()
            .sorted(
                Comparator.comparing(StockHistory::getPriceFluctuation)
                    .thenComparing(StockHistory::getRateVolume20Day)
                    .reversed())
            .skip((req.getPage() - 1) * req.getSize())
            .limit(req.getSize())
            .map(e -> e.toDTO())
            .collect(Collectors.toList());

    return ObjectRecord.<List<StockHistoryDTO>>builder()
        .total((long) stockPassFilter.size())
        .records(stockHistoryDTOS)
        .build();
  }

  public ObjectRecord<List<StockHistoryDTO>> findStockHistoryByCode(FindStockByCodeReq req) {

    Pageable pageable = PageRequest.of(req.getPage() - 1, req.getSize());
    Page<StockHistory> stockHistoryPage =
        ModelMapperUtils.mapPage(
            stockHistoryRepository.findStockHistoryByCode(req.getCode(), pageable),
            StockHistory.class);

    List<StockHistory> stockHistories = stockHistoryPage.getContent();
    enrichAverageDataStatistic(stockHistories);
    enrichExtraInfo(stockHistories);

    return ObjectRecord.<List<StockHistoryDTO>>builder()
        .total(stockHistoryPage.getTotalElements())
        .records(stockHistories.stream().map(e -> e.toDTO()).collect(Collectors.toList()))
        .build();
  }

  public void syncStockHistory(SyncStockHistoryReq req)
      throws JsonProcessingException, InterruptedException {

    if (Objects.isNull(req.getFromDate()) || req.getFromDate().isAfter(LocalDate.now())) return;
    stockHistoryCrawler.crawl(req.getFromDate());
    statisticDataTodayJob.process(req.getFromDate());
    log.info("END syncStockHistory");
  }

  public void followStock(String code){
    StockFollow stockFollowExist = stockFollowRepository.findByCode(code).map(e->ModelMapperUtils.mapper(e,StockFollow.class)).orElse(null);
    if(Objects.nonNull(stockFollowExist)){
      /*
      * active to inactive, or else
      * */
      stockFollowExist.setActive(1 - stockFollowExist.getActive());
      stockFollowRepository.save(ModelMapperUtils.mapper(stockFollowExist, StockFollowEntity.class));
    }else{
      StockFollow stockFollow = StockFollow.builder()
              .code(code)
              .active(1)
              .extraInfo(null)
              .build();
      stockFollowRepository.save(ModelMapperUtils.mapper(stockFollow, StockFollowEntity.class));
    }
  }

  private void enrichExtraInfo(List<StockHistory> stockPassFilter) {
    for (StockHistory stockHistory : stockPassFilter) {
      stockHistory.setRateVolume10Day(stockHistory.getRateVolume10Day());
      stockHistory.setRateVolume20Day(stockHistory.getRateVolume20Day());
      stockHistory.setRateVolume50Day(stockHistory.getRateVolume50Day());
      stockHistory.setCeilingPrice(stockHistory.isCeilingPrice());
    }
  }

  private void enrichAverageDataStatistic(List<StockHistory> stockHistories) {
    for (StockHistory st : stockHistories) {
      try {
        st.setAverageDataStatisticToday(
            JsonUtils.map(st.getDataStatisticToday(), new TypeReference<>() {}));
      } catch (Exception e) {
        log.error("Exception enrichAverageDataStatistic {} {}", st.getCode(), e);
      }
    }
  }


  @EventListener(ApplicationReadyEvent.class)
  private List<StockHistory> getAllStockUnderBBMiddle()  {

    for(LocalDate from = LocalDate.of(2023,12,14); from.isBefore(LocalDate.now()) ; from = from.plusDays(1)){
      List<StockHistory> stockHistories = ModelMapperUtils.mapList(stockHistoryRepository.findByDay(from), StockHistory.class);
      enrichService.enrichBollingerBand(stockHistories);
      List<StockHistory> stockUnderBBMiddle = new ArrayList<>();
      List<StockHistory> stockUnderBBUnder = new ArrayList<>();
      for(StockHistory st:stockHistories){
        try{
          BollingerBand bb = st.getBollingerBand();
          if(st.getLowestPrice() < bb.getLowerBand()){
            stockUnderBBUnder.add(st);
          }else if(st.getLowestPrice() < bb.getMiddleBand()){
            stockUnderBBMiddle.add(st);
          }
        }catch (Exception e){
          log.error("===============Exception getAllStockUnderBBMiddle {}",st.getCode());
        }
      }
      System.out.println("===================UNDER BB: "+from);
      LocalDate finalFrom = from;
      stockUnderBBUnder.stream().forEach(e -> System.out.println(e.getCode() + ": " + e.getLowestPrice() + ": " + finalFrom.toString()));

      System.out.println("===================UNDER MIDDLE: "+from);
      stockUnderBBMiddle.stream().forEach(e -> System.out.println(e.getCode() + ": "+ finalFrom.toString()));
    }


    return null;
  }

}
