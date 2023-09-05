package com.example.ai.stock.job;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface JobBackground {

  void process() throws JsonProcessingException;
}
