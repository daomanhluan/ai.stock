//package com.example.ai.stock.service.bean;
//
//import com.example.ai.stock.common.constant.GlobalConstant;
//import com.example.ai.stock.domain.stock.model.Stock;
//import com.example.ai.stock.domain.stock.model.StockHistory;
//import com.example.ai.stock.domain.stock.processor.StockHistoryProcessor;
//import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//@Slf4j
//public class AnalyseAndUpdateStock {
//
//  private final StockHistoryProcessor stockHistoryProcessor;
////  private final CompositeEvaluationFilter compositeEvaluationFilter;
////
//  public void analyseStockAndUpdate(String stockCode) {
//
//    System.out.println("==========="+Thread.currentThread().getName() +" RUN");
//    List<StockHistory> stockHistories =
//        stockHistoryProcessor.findByCode(stockCode).stream()
//            .sorted(Comparator.comparing(StockHistory::getDay))
//            .collect(Collectors.toList());
//    stockHistories = stockHistories.stream().filter(e->e.getDay().isAfter(GlobalConstant.FROM_AT)).collect(Collectors.toList());
//
//    List<Stock> evaluationStocks = new ArrayList<>();
//    StockHistory lastStockHistoryDay = null;
//    for (StockHistory stockHistory : stockHistories) {
//      evaluationStocks.add(toStock(stockHistory, lastStockHistoryDay));
//      lastStockHistoryDay = stockHistory;
//    }
//
//    List<Stock> stocks =
//        compositeEvaluationFilter.filter(evaluationStocks).stream()
//            .filter(e -> e.getEvaluationDay().getYear() >= 2020)
//            .collect(Collectors.toList());
//
//    List<StockHistoryEntity> stockHistoryEntities =
//        stockHistoryProcessor.findByIds(
//            stocks.stream().map(e -> e.getId()).collect(Collectors.toList()));
//    stockHistoryEntities.forEach(
//        e -> {
//          Optional<Stock> opt =
//              stocks.stream().filter(x -> Objects.equals(e.getId(), x.getId())).findFirst();
//          e.setPointToBuy(opt.get().getPointToBuy());
//        });
//    try{
//        stockHistoryProcessor.saveAll(stockHistoryEntities);
//    }catch (Exception e){
//        log.error("Exception analyseStockAndUpdate {} {}",e,stockCode);
//    }
//
//
//    System.out.println("============================DONE "+stockCode);
//  }
//
//  private Stock toStock(StockHistory stockHistory, StockHistory lastStockHistoryDay) {
//    return Stock.builder()
//        .id(stockHistory.getId())
//        .code(stockHistory.getCode())
//        .baseData(
//            Objects.nonNull(lastStockHistoryDay)
//                ? lastStockHistoryDay.getAverageDataStatisticToday()
//                : null)
//        .changePercent(stockHistory.getPriceFluctuation())
//        .volumeEvaluation((int) (stockHistory.getVolume() * 0.8f))
//        .priceEvaluation(stockHistory.getClosedPrice())
//        .evaluationDay(stockHistory.getDay())
//        .build();
//  }
//}
