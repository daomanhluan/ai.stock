package com.example.ai.stock.controller.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ObjectRecord<T> {
  private Long total;
  private T records;

}
