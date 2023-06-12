package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Некорректные тестовые значения:
//Неверная дата: fg hj yt uu rr qq   Неверный телефон: fg hj yt 20.12.2000 rr qq  Неверный пол: fg hj yt 20.12.2000 89601471122 qq

        // Корректные тестовые значения:
        //Smit Jon Aple 12.01.2000 89541234455 m
        //Иванов Иван Иванович 04.05.1996 89747894455 m
        boolean flag = true;
        while (flag) {
            Data d1 = new Data();
            Human h = new Human();
            String[] info = null;
            CorrectData cd = new CorrectData();
            try {
                info = d1.parse(d1.getInfoAboutHuman());
                cd.isCorrectDate(info);
                cd.isCorrectTel(info);
                cd.isCorrectSex(info);
                h = new Human(info[0], info[1], info[2], info[3], info[4], info[5]);
                WriterToFile writerToFile = new WriterToFile();
                writerToFile.writeToFile(h.toString(), info[0]);
            } catch (FormatDateException | FormatSexException | PhoneNumberException e) {
                e.printStackTrace();
            } catch (RuntimeException e) {
                System.err.println("Ошибка записи в файл");
            }
            System.out.println("Хотите записать еще одного человека? Нажмите 1 - Да, 2 - Нет");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 1) flag = true;
            else flag = false;
        }
    }
}