package com.example.ai.stock.infrastruture.repository;

import com.example.ai.stock.infrastruture.entity.StockHistoryEntity;
import com.example.ai.stock.infrastruture.vo.StockWithDay;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface StockHistoryRepository extends JpaRepository<StockHistoryEntity, Integer> {

  List<StockHistoryEntity> findByCode(String code);

  @Query(value = "select * from stock_history where code = :code order by day desc",nativeQuery = true)
  Page<StockHistoryEntity> findStockHistoryByCode(String code, Pageable pageable);

  List<StockHistoryEntity> findByCodeInAndDay(List<String> codes, LocalDate localDate);
  List<StockHistoryEntity> findByIdIn(List<Integer> ids);

  @Query(
      value = "select * from stock_history where  day =:day and JSON_EXTRACT(data_statistic_today, \"$.average_price50ay\") > closed_price and volume > 100000 order by volume desc",
      nativeQuery = true)
  Page<StockHistoryEntity> findStockBreakMA50(LocalDate day, Pageable pageable);

  @Query(
          value = "select * from stock_history where day =:day and volume > 100000 order by volume desc",
          nativeQuery = true)
  List<StockHistoryEntity> findHotStockToday(LocalDate day);

  @Query(
      value =
          "select code, day, count(*) from stock_history where `day` >= :day \n"
              + "group by code, day\n"
              + "having count(*) > 1",
      nativeQuery = true)
  List<StockWithDay> findDataDuplicate(LocalDate day);

  List<StockHistoryEntity> findByCodeAndDay(String code, LocalDate day);

  @Query(value = "select * from stock_history order by day desc limit 1", nativeQuery = true)
  List<StockHistoryEntity> findStockLatest();

  List<StockHistoryEntity> findByDay(LocalDate day);
}
