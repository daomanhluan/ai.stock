package com.example.ai.stock.controller;

import com.example.ai.stock.controller.dto.StockHistoryDTO;
import com.example.ai.stock.controller.request.FindStockBreakMA50Req;
import com.example.ai.stock.controller.request.FindStockByCodeReq;
import com.example.ai.stock.controller.request.StockCodeRequest;
import com.example.ai.stock.controller.request.SyncStockHistoryReq;
import com.example.ai.stock.controller.response.ObjectRecord;
import com.example.ai.stock.controller.response.TemplateResponse;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.service.StockHistoryService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/stock")
@RequiredArgsConstructor
@Slf4j
public class StockController {

  private final StockHistoryService stockHistoryService;

  @PostMapping("/find-stock-break-ma")
  public ResponseEntity<TemplateResponse<ObjectRecord<List<StockHistoryDTO>>>> findStockBreakMA50(
      @RequestBody FindStockBreakMA50Req req) {
    ObjectRecord<List<StockHistoryDTO>> res = stockHistoryService.findStockBreakMA50(req);

    return ResponseEntity.ok()
        .body(
            TemplateResponse.<ObjectRecord<List<StockHistoryDTO>>>builder()
                .message("OK")
                .success(true)
                .data(res)
                .build());
  }

  @PostMapping("/find-hot-stock-today")
  public ResponseEntity<TemplateResponse<ObjectRecord<List<StockHistoryDTO>>>> findHotStockToday(
      @RequestBody FindStockBreakMA50Req req) {
    ObjectRecord<List<StockHistoryDTO>> res = stockHistoryService.findHotStockToday(req);
    return ResponseEntity.ok()
        .body(
            TemplateResponse.<ObjectRecord<List<StockHistoryDTO>>>builder()
                .message("OK")
                .success(true)
                .data(res)
                .build());
  }

  @PostMapping("/find-stock-by-code")
  public ResponseEntity<TemplateResponse<ObjectRecord<List<StockHistoryDTO>>>> findStockByCode(
      @RequestBody FindStockByCodeReq req) {
    ObjectRecord<List<StockHistoryDTO>> res = stockHistoryService.findStockHistoryByCode(req);
    return ResponseEntity.ok()
        .body(
            TemplateResponse.<ObjectRecord<List<StockHistoryDTO>>>builder()
                .message("OK")
                .success(true)
                .data(res)
                .build());
  }

  @PostMapping("/sync-stock-history")
  public ResponseEntity<TemplateResponse<Void>> syncStockHistory(
      @RequestBody SyncStockHistoryReq req) throws JsonProcessingException, InterruptedException {
    stockHistoryService.syncStockHistory(req);
    log.info("syncStockHistory");
    return ResponseEntity.ok().body(null);
  }

  @PostMapping("/follow-stock")
  public ResponseEntity<TemplateResponse<Void>> followStock(
          @RequestBody StockCodeRequest req) throws JsonProcessingException, InterruptedException {
    stockHistoryService.followStock(req.getCode());
    log.info("follow-stock");
    return ResponseEntity.ok().body(null);
  }


  public void getAllStockUnderBBMiddle(){

  }
}
