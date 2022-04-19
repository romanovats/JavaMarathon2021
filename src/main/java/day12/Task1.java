package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("Марка 1");
        cars.add("Марка 2");
        cars.add("Марка 3");
        cars.add("Марка 4");
        cars.add("Марка 5");

        System.out.println(cars);

        cars.add(2, "Марка 6");
        System.out.println(cars);
        cars.remove(0);
       System.out.println(cars);

    }
}
