package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int floorCount = s.nextInt();

        if (floorCount == 1 || floorCount == 2 || floorCount == 3 || floorCount == 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorCount == 5 || floorCount == 6 || floorCount == 7 || floorCount == 8) {
            System.out.println("Среднеэтажный дом");
        }
        else if (floorCount <= 0) {
            System.out.println("Ошибка ввода");
            }
        else  {
            System.out.println("Многоэтажный дом");
            }
        }
}