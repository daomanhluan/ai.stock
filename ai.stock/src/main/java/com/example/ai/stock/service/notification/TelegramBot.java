package com.example.ai.stock.service.notification;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class TelegramBot extends TelegramLongPollingBot {
    private static final String BOT_TOKEN = "bot6243027676:AAE7pESqXzgJw5g9TIT5PEnyE7oYuMWff5s";
    private static final String GROUP_CHAT_ID = "-4058920790";

    public static void main(String[] args) throws TelegramApiException {
        TelegramBot bot = new TelegramBot();
        bot.run();
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Handle incoming updates (messages, etc.)
    }

    public void sendTableToGroup(String[][] table) {
        StringBuilder messageBuilder = new StringBuilder();

        // Add table headers
        messageBuilder.append("STT | CODE | CHANGE | VolumeToday | AverageVolume10 | AverageVolume20\n");

        // Add table rows
        for (String[] row : table) {
            for (String cell : row) {
                messageBuilder.append(cell).append(" | ");
            }
            messageBuilder.append("\n");
        }

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(GROUP_CHAT_ID);
        sendMessage.setText(messageBuilder.toString());

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "your_bot_username";
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    public void run() throws TelegramApiException {
        // Start the bot and listen for updates
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        try {
            botsApi.registerBot(new TelegramBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}