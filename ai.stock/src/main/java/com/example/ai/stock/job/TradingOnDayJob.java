package com.example.ai.stock.job;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TradingOnDayJob implements JobBackground{

    @Override
    public void process() throws JsonProcessingException {

    }
}
