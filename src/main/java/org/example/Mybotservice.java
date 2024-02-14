package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Mybotservice {



    public SendMessage sendMessage(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Assalom Alekum\n" +
                "Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setSelective(true);
        List<KeyboardRow> rows = new ArrayList<>();


        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("\uD83D\uDCF2Raqam yuborish");
        button.setRequestContact(true);
        row.add(button);
        rows.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Keyingi");
        row1.add(button1);
        rows.add(row1);


//        KeyboardButton button1 = new KeyboardButton();
//        KeyboardRow row1 = new KeyboardRow();
//        button1.setText("❌Bekor qilish");
//        row1.add(button1);
//        rows.add(row1);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;

    }
    public SendMessage Otaona(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kim sifatida kirmoqchisiz");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Ota-ona");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Oquvchi");
        row.add(button1);
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;


    }
    public SendMessage Otaonakirish(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qanday shikoyatangiz bor");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();


        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("Bolaning hafsizligi");
        row.add(button);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Oshxona");
        row.add(button1);
        rows.add(row);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Maktabdagi sharoit");
        row1.add(button2);



        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Tozalik");
        row1.add(button3);
        rows.add(row1);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Boshqa");
        row2.add(button4);
        rows.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Orqaga");
        row3.add(button5);
        rows.add(row3);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;


    }
    public SendMessage xabar1(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'z izohingizni qoldiring :");
        return sendMessage;

    }
    public SendMessage xabar2(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("PDP shool uchun qanday takliflaringiz bor:");
        return sendMessage;

    }


    public SendMessage Oquvchikirish(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qanday shikoyatangiz bor");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();


        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Ta'lim haqida");
        row.add(button);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Taomlar");
        row.add(button1);
        rows.add(row);




        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Sinifdoshlar haqida");
        row1.add(button2);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Maktab sharoyiti");
        row1.add(button5);
        rows.add(row1);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Boshqa");
        row3.add(button3);
        rows.add(row3);



        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Orqaga");
        row2.add(button4);
        rows.add(row2);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;


    }

}

