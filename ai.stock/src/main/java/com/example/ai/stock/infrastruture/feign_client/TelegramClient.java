package com.example.ai.stock.infrastruture.feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "tele-notify", url = "${bot.tele.url}")
public interface TelegramClient {

  @RequestMapping(
      method = RequestMethod.GET,
      value = "${bot.tele.send.message}",
      consumes = MediaType.APPLICATION_JSON_VALUE)
  String notify(@RequestParam("chat_id") String chatId, @RequestParam("text") String text);
}
