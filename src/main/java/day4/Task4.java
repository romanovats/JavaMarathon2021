package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[] mas = new int[5];
        int[] sumMas = new int[5];
        int sumMax = 0;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(5);
            System.out.println(mas[i]);
        }

        for (int i = 0; i < mas.length-2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mas[i+j] + " ");
                sumMas[i] += mas[i+j];
            }
            System.out.println(" сумма строки: " + sumMas[i]);
        }
        sumMax = sumMas[1];
        for (int i = 0; i < sumMas.length; i++) {
            if (sumMas[i] > sumMax) {
                sumMax = sumMas[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + " - индекс первого элемента тройки с максимальной суммой");


    }
}
