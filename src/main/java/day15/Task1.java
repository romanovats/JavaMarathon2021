package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/shoes.csv");
        File file2 = new File("src/main/resources/missing_shoes.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(file2);

        while (scanner.hasNextLine()) {
            String[] listShoes = (scanner.nextLine()).split(";");

            if(Integer.parseInt(listShoes[2]) == 0) {
                System.out.print(listShoes[0] + ", " + listShoes[1] + "," + listShoes[2] +"\n");
                pw.print(listShoes[0] + ", " + listShoes[1] + "," + listShoes[2] +"\n");
            }
        }
        pw.close();



    }
}
