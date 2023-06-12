package org.example;

public class FormatDateException extends RuntimeException {
    public FormatDateException() {
        super("Введите корректную дату дд.мм.гггг");
    }
}
