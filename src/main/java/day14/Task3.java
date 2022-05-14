package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> listPerson = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Person person = new Person();
                String[] readFilePerson =  scanner.nextLine().split(" ");
                person.setName(readFilePerson[0]);
                person.setAge(Integer.parseInt(readFilePerson[1]));

                if(person.getAge() < 0){
                    try {
                        throw  new IOException();
                    } catch (IOException e1) {
                        System.out.println("Некорректный входной файл");
                    }
                } else {
                    listPerson.add(person);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return listPerson;
    }
}
