package com.example.ai.stock.service.notification;

import com.example.ai.stock.infrastruture.feign_client.TelegramClient;
import com.example.ai.stock.infrastruture.request.MessageTelegramRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TelegramNotification implements Notify {

  @Value("${bot.tele.chat_id}")
  private String chatId;

  @Value("${bot.tele.parse_mode}")
  private String parseMode;

  private final TelegramClient telegramClient;

//  @EventListener(ApplicationReadyEvent.class)
  public void test() {

    StringBuilder messageBuilder = new StringBuilder();

    // Add table headers
    messageBuilder.append("STT | CODE | CHANGE | VOL | V_10 | V_20\n");
    for(int i=1;i<=6;i++){
      for(int j=1;j<=6;j++){
        messageBuilder.append("cell").append(" | ");
      }
      messageBuilder.append("\n");
    }
    sendMessage(messageBuilder.toString());
  }

  @Override
  public void sendMessage(String message) {
    MessageTelegramRequest request =
        MessageTelegramRequest.builder().chatId(chatId).parseMode(parseMode).text(message).build();
    telegramClient.notify(request);
  }
}
