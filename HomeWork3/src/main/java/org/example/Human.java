package org.example;

/**
 * фамилия, имя, отчество - строки
 * датарождения - строка формата dd.mm.yyyy
 * номертелефона - целое беззнаковое число без форматирования
 * пол - символ латиницей f или m.
 */

public class Human {
    String surname;
    String name;
    String lastname;
    String dateOfBirthday;
    String tel;
    String sex;

    public Human() {
    }

    public Human(String surname, String name, String lastname, String dateOfBirthday, String tel, String sex) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirthday = dateOfBirthday;
        this.tel = tel;
        this.sex = sex;
    }

    public boolean isCorrectInputByCount(String str) {
        String[] arr = str.split(" ");
        if (arr.length != 6) {
            throw new RuntimeException("Проверьте введенные данные. Строка должна состоять из " +
                    "6 слов. Вы ввели следующие данные: \n" + str);
        }
        return true;
    }

    public String getSurname(String[] arr) {
        String surname = arr[0];
        return surname;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + lastname + " " + dateOfBirthday + " " + tel + " " + sex;
    }
}
