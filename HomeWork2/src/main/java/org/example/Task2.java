package org.example;

/**
 * 2. Если необходимо, исправьте данный код
 * try {
 * int d = 0;
 * double catchedRes1 = intArray[8] / d;
 * System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 * System.out.println("Catching exception: " + e);
 * }
 */
public class Task2 {
    double catchedRes1 = 0;
    boolean flag = true;

    public void getResultDevision(int[] arr, int position, int someNumber) {
        int d = someNumber;
        try {
            catchedRes1 = arr[position] / d;
        } catch (IndexOutOfBoundsException e) {
            flag = false;
            System.err.println("Индекс не корректный");
        } catch (ArithmeticException e) {
            flag = false;
            System.out.println("Catching exception: " + e);
        }
        if (flag) System.out.println("catchedRes1 = " + catchedRes1);
    }

}
