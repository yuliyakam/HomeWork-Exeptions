package org.example;

public class CorrectData {
    public CorrectData() {
    }

    /**
     * Проверка корректости даты
     *
     * @param str
     * @return
     */

    public boolean isCorrectDate(String[] str) {
        String[] array = null;
        String date = str[3];

        if (date.contains(".")) {
            array = date.split("\\.");
        } else throw new FormatDateException();

        if (array.length != 3) {
            throw new FormatDateException();
        }
        for (String el : array) {
            if (!isDigit(el)) throw new FormatDateException();
        }
        return true;
    }

    private static boolean isDigit(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Проверка корректности введенного номера телефона
     *
     * @param str строка введенная пользователем
     * @return
     */
    public boolean isCorrectTel(String[] str) {
        String tel = str[4];
        if (!isLong(tel)) throw new PhoneNumberException();
        return true;
    }

    private static boolean isLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Проверка корректности пола
     *
     * @param str
     * @return
     */
    public boolean isCorrectSex(String[] str) {
        String sex = str[5];
        if (sex.equals("f") | sex.equals("m")) return true;
        else throw new FormatSexException();
    }
}
