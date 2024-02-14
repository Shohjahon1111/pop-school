package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    private Mybotservice mybotservice=new Mybotservice();
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()&&update.getMessage().hasText()){
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            if (text.equals("/start")){
                try {
                    execute(mybotservice.sendMessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (text.equals("Keyingi")){
                try {
                    execute(mybotservice.Otaona(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Ota-ona")){
                try {
                    execute(mybotservice.Otaonakirish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Orqaga")){
                try {
                    execute(mybotservice.Otaona(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Oquvchi")){
                try {
                    execute(mybotservice.Oquvchikirish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Bolaning hafsizligi")){
                try {
                    execute(mybotservice.xabar1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Oshxona")){
                try {
                    execute(mybotservice.xabar1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Maktabdagi sharoit")){
                try {
                    execute(mybotservice.xabar1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tozalik")){
                try {
                    execute(mybotservice.xabar1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Boshqa")){
                try {
                    execute(mybotservice.xabar2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }

    @Override
    public String getBotUsername() {
        return "pdpjava_bot";
    }

    @Override
    public String getBotToken() {
        return "6770532415:AAHyvvWDvKcOcWlifSaGO6u4KZ4Zrj-mL6Y";
    }
}
