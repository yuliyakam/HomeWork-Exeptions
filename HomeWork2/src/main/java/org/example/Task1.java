package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
 * значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */

public class Task1 {
    float number = 0;
    public float echo(){
        System.out.println("Введите дробное число, целую часть отделите от дробной запятой!");
        Scanner input = new Scanner(System.in);

        try {
            number = input.nextFloat();
        }
        catch (InputMismatchException e){
            echo();
            return number;
        }
//        catch (Exception e){
//            System.err.println("Произошла непредвиденная ошибка, попробуйте ещё раз");
//            echo();
//        }
        return number;
    }
}
