package org.example;



public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task4 t4 = new Task4();
        /**
         * Первое задание
         */
        //System.out.println(t1.echo());
        /**
         * Второе задание
         */
        //t2.getResultDevision(array, 3, 2);
        //t2.getResultDevision(array, 7, 2); //Выдает ошибку Индекс не корректный
        //t2.getResultDevision(array, 3, 0); //Catching exception: java.lang.ArithmeticException: / by zero

        t4.emptyString();


    }
}