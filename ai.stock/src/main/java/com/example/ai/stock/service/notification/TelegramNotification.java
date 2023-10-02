package com.example.ai.stock.service.notification;

import com.example.ai.stock.infrastruture.feign_client.TelegramClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TelegramNotification implements Notify {

  @Value("${bot.tele.chat_id}")
  private String chatId;
  private final TelegramClient telegramClient;

  @EventListener(ApplicationReadyEvent.class)
  public void test(){
    sendMessage("Hello");
  }

  @Override
  public void sendMessage(String message) {

    System.out.println("aaa");
    telegramClient.notify(chatId,"Hello");
  }
}
