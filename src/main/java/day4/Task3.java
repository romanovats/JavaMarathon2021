package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[][] mas = new int[8][12];
        int[] sumRow = new int[8];
        int maxValue = 0;
        int index = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(50);
                System.out.print(mas[i][j] + " ");
                sumRow[i] += mas[i][j];
            }
            System.out.println("Сумма " + i + " строки: " +sumRow[i]);
        }

        for (int i = 0; i < sumRow.length; i++) {
            if (sumRow[i] > maxValue) {
                maxValue = sumRow[i];
                index = i;
            }
        }
        System.out.println("Максимальная сумма: " + maxValue + ", индекс строки: " + index);





    }
}
