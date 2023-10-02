package com.example.ai.stock.infrastruture.feign_client;

import com.example.ai.stock.service.notification.SendMessageRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "tele-notify", url = "${bot.tele.url}")
public interface TelegramClient {

  @RequestMapping(
      method = RequestMethod.POST,
      value = "${bot.tele.send.message}",
      consumes = MediaType.APPLICATION_JSON_VALUE)
  String notify(@RequestBody SendMessageRequest request);
}
