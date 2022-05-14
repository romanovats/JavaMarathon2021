package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(parseFileToStringList(new File("people.txt")));

    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        for (String str: list) {
            String[] strNumb = str.split(" ");
            for (int i =1; i< strNumb.length; i+=2) {
               if (Integer.parseInt(strNumb[i]) < 0) {
                   try {
                       throw  new IOException();
                   } catch (IOException e) {
                       System.out.println("Некорректный входной файл");
                   }
               }
            }
        }

        return list;
    }
}
