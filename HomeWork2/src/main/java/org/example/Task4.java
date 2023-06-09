package org.example;
/**
 * 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
 * показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task4 {
    //Первый способ
    public void emptyString() {
        boolean flag = true;
        while (flag){
            System.out.println("Input value. Empty string be error!!!");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();// не реагирует на пробел, ввод считает корректным
            if (str.isEmpty() || str.isBlank()) {
                System.err.println("You input empty string! Try again!");
            }
            else flag = false;
        }
    }
    //Второй способ
    public void emptyString1() {
            System.out.println("Input value. Empty string be error!!!");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            if (str.isEmpty() || str.isBlank())
                throw new RuntimeException("You input empty string!");
    }
}
