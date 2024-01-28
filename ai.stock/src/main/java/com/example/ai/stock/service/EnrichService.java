package com.example.ai.stock.service;

import com.example.ai.stock.common.utils.JsonUtils;
import com.example.ai.stock.common.utils.ModelMapperUtils;
import com.example.ai.stock.domain.stock.model.BollingerBand;
import com.example.ai.stock.domain.stock.model.StockFollow;
import com.example.ai.stock.domain.stock.model.StockHistory;
import com.example.ai.stock.infrastruture.entity.StockFollowEntity;
import com.example.ai.stock.infrastruture.repository.StockFollowRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class EnrichService {
    private final StockFollowRepository stockFollowRepository;

    public void enrichStockFollow(List<StockHistory> stockHistories){
        List<StockFollow> stockFollows = ModelMapperUtils.mapList(stockFollowRepository.findStockFollowActive(), StockFollow.class);
        for(StockHistory st:stockHistories){
            Optional<StockFollow> opt = stockFollows.stream().filter(e-> Objects.equals(e.getCode(), st.getCode())).findFirst();
            st.setStockFollow(opt.orElse(null));
        }
    }

    public void enrichBollingerBand(List<StockHistory> stockHistories) {
        for(StockHistory st:stockHistories){
           try{
               BollingerBand bb = JsonUtils.map(st.getBollingerBandStr(), new TypeReference<>() {
               });
               st.setBollingerBand(bb);
           }catch (Exception e){
               log.error("Exception enrichBollingerBand", e);
           }
        }
    }
}
