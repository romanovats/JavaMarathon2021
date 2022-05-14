package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("day14_task1.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) throws IOException {
        int sum = 0;

        try {
            Scanner scanner = new Scanner(file);
            String[] numbers = (scanner.nextLine()).split(" ");
            if (numbers.length == 10) {
                for (String numb : numbers) {
                    sum += Integer.parseInt(numb);
                }
                System.out.println(sum);
            } else {
                throw new IOException("Некорректный входной файл");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }/* catch (IOException e) {
            System.out.println("Некорректный входной файл");
        } */

    }
}
