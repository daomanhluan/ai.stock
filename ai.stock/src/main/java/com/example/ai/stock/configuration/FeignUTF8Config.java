package com.example.ai.stock.configuration;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import feign.Util;
import feign.codec.Decoder;
import org.springframework.context.annotation.Bean;

public class FeignUTF8Config {
    @Bean
    public Decoder feignDecoder() {
        return (response, type) -> {
            String bodyStr = Util.toString(response.body().asReader(Util.UTF_8));
            JavaType javaType = TypeFactory.defaultInstance().constructType(type);
            return new ObjectMapper().readValue(bodyStr, javaType);
        };
    }
}