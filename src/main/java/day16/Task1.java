package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("day14_task1.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        float sum = 0;
        String[] numbers;
        Scanner scanner = new Scanner(file);
        numbers = (scanner.nextLine()).split(" ");
        for (String number : numbers) {
            sum += Float.parseFloat(number);
        }
        System.out.print(sum / numbers.length + " --> ");
        System.out.printf("%.3f %n", sum / numbers.length);
    }
}
