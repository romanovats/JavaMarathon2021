package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int count8 = 0;
        int count1 = 0;
        int chotkiyPoc = 0;
        int neChotkiyPoc = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int masLength = scanner.nextInt();
        int mas[] = new int[masLength];

        System.out.println("Длина массива: " + masLength);

        for (int i = 0; i < masLength; i++) {
            mas[i] = rnd.nextInt(10);
            System.out.print(mas[i] + " ");
        }

        for (int i = 0; i < mas.length; i++) {

            sum += mas[i];

            if(mas[i] > 8) {
                count8++;
            }
            if (mas[i] == 1) {
                count1++;
            }
            if (mas[i] % 2 == 0){
                chotkiyPoc++;
            }
            if (mas[i] % 2 != 0){
                neChotkiyPoc++;
            }
        }

        System.out.println("\nКоличество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + chotkiyPoc);
        System.out.println("Количество нечетных чисел: " + neChotkiyPoc);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
