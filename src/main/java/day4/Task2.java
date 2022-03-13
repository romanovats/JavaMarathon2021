package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int mas[] = new int[10];
        int maxVal = 0;
        int minVal = 0;
        int count0 = 0;
        int sum0 = 0;

        for (int i = 0; i < 10; i++) {
            mas[i] = rnd.nextInt(100);
            System.out.println(mas[i]);
        }

        maxVal = minVal = mas[0];

        for (int i : mas) {
            if (i > maxVal) {
                maxVal = i;
            }
            if (i < minVal ) {
                minVal = i;
            }
            if (i % 10 == 0) {
                count0++;
                sum0 += i;
            }
        }
        System.out.println("наибольший элемент массива: " + maxVal);
        System.out.println("наименьший элемент массива: " + minVal);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count0);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum0);


    }
}
