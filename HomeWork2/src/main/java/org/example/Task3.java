package org.example;

/**
 *  Дан следующий код, исправьте его там, где требуется
 */
public class Task3 {
    public static void main(String[] args){
        try {
            int a = 90;// данные значения могут быть переданы в качестве аргументов,
            int b = 3;
            System.out.println(a / b);//тогда есть смысл в ошибке деления на 0
            printSum(23, 234);// здесь в связи с тем, что аргументы типа Integer, может прийти null
            int[] abc = { 1, 2 };//в данном коде мы видим массив и можем корректно обратиться по индексу, но если бы метод
            abc[3] = 9;//был более гибким и позволял работать с произвольным массивом имело бы смысл обработать выход за пределы массива
        } catch (ArithmeticException e) {
            System.err.println("Деление на 0 невозможно " + e);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b){
        try {
            System.out.println(a + b);
        }
        catch (NullPointerException e){
            System.err.println("В метод пришло значение null");
        }

    }

}
