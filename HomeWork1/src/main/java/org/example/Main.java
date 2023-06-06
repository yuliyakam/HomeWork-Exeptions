/* Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
   * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь
может увидеть - RuntimeException, т.е. ваше.
* */
package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * Задание 1
         */
        //System.out.println(getFileSize(new File("123"))); Выкидывает ошибку Exception in thread "main"
        // java.io.FileNotFoundException: Файл не найден!

        //del(2,0); //Выкидывает Exception in thread "main" java.lang.RuntimeException: Делить на 0 нельзя!

        //getElement(arr2, 6);//Выкидывает Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 6 out of bounds for length 5

        String word = null;

        //getLengthOfStr(word);//Выкидывает Exception in thread "main" java.lang.NullPointerException: Cannot invoke
        // "String.length()" because "str" is null

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{4, 2, -1, 0, 1};
        /**
         * Задание 3
         */
        //System.out.println(Arrays.toString(arrDifferent(arr1, arr2)));

        /**
         * Задание 4
         */
        System.out.println(Arrays.toString(arrDivision(arr1, arr2)));
    }

    /**
         * Задание 1 Методы выкидывающие исключения
         */
        // Первый
        public static long getFileSize (File file) throws FileNotFoundException {
            //if (!file.exists()) return -1L;//если файл не существует возвращаем -1. Но у такого подхода есть минус. При
            // возвращаемом числовом типе будет не ясно был ли -1 ответом или кодом ошибки. Так же ответ -1 не информативен
            // и не в полной мере объясняет ошибку при которой файл не был считан. Для этого подходит исключ FileNotFoundException
            if (!file.exists()) {
                throw new FileNotFoundException("Файл не найден!");
            }
            return file.length();
        }
        // Второй
        public static void del ( int num1, int num2){
            if (num2 == 0) {
                throw new RuntimeException("Делить на 0 нельзя!");
            }
            System.out.println(num1 / num2);//Если num2=0 то получаем ArithmeticException, чтобы избежать этой ошибки сделаем
            // проверку через исключение throw new RuntimeException
        }
        // Третий
        public static void getElement ( int[] arr, int position){
            System.out.println(arr[position]);
        }
        // Четвертый
        public static int getLengthOfStr (String str){
            return str.length();
        }

        /**
         *  Задание 2 Подумать какие исключения можно получить
         * @param arr двумерный массив
         * @return сумма всех элементов
         */
        private static int sum2d (String[][]arr){//можнт прийти null Исключение NullPointerException: Cannot read the
            // array length because "arr" is null
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {// Если кол-во элементов во вложенном массиве будет меньше 5 получим
                    // ArrayIndexOutOfBoundsException
                    int val = Integer.parseInt(arr[i][j]);//Т.к массив строковый, то элементы могут быть буквами, тогда
                    // метод parseInt вернет NumberFormatException
                    sum += val;
                }
            }
            return sum;
        }

        /**
         * Задание 3
         * @param arr1 целочисленный массив
         * @param arr2 целочисленный массив
         * @return result - результирующий массив с элементами = разности элементов 2х входящих массивов на соответ-х позиц
         */
        public static int[] arrDifferent ( int[] arr1, int[] arr2){
            int length = arr1.length;
            if (arr1.length != arr2.length) {
                throw new RuntimeException("Массивы разной длины");
            } else {
                int[] result = new int[length];
                for (int i = 0; i < length; i++) {
                    result[i] = arr1[i] - arr2[i];
                }
                return result;
            }
        }

    /**
     * Задание 4
     * @param arr1 целочисленный массив
     * @param arr2 целочисленный массив
     * @return result - результирующий массив с элементами = частному элементов 2х входящих массивов на соответ-х позиц
     */
        public static double[] arrDivision (int[] arr1, int[] arr2){
            int length = arr1.length;
            if (arr1.length != arr2.length) {
                throw new RuntimeException("Массивы разной длины");
            } else {
                double[] result = new double[length];
                for (int i = 0; i < length; i++) {
                    if (arr2[i] == 0) {
                        throw new RuntimeException("Делить на ноль недьзя");
                    }
                    result[i] = arr1[i] * 1.0 / arr2[i];
                }
                return result;
            }
        }

}