package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        Random rn = new Random();
        int sum =0;
        String[] numbers = null;
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        PrintWriter pw = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);

        for (int i = 0; i < 1000; i++) {
            pw.print(rn.nextInt(100) + " ");
        }
        pw.close();

        Scanner scanner = new Scanner(file1);

        numbers = (scanner.nextLine()).split(" ");
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
            if((i+1) % 20 == 0) {
                pw2.print((sum / 20.0) + " ");
                sum = 0;
            }
        }
        pw2.close();

        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] numbers = null;
        double sum = 0;

       numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            sum += Double.parseDouble(number);
        }
        System.out.println("Сумма до округления "+ sum);
        System.out.println("Сумма после округления "+ Math.round(sum));
    }


}
