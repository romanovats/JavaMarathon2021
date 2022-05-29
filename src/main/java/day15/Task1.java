package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/shoes.csv");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String[] listShoes = (scanner.nextLine()).split(";");

            if(Integer.parseInt(listShoes[2]) == 0) {
                System.out.print(listShoes[0] + ", " + listShoes[1] + "," + listShoes[2] +"\n");
            }
        }



    }
}
