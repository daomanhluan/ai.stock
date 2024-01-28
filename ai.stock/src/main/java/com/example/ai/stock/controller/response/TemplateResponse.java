package com.example.ai.stock.controller.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TemplateResponse<T> {
  private String message;
  private boolean success;
  private T data;
}
