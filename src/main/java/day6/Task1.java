package day6;

public class Task1 {
    public static void main(String[] args) {

        Car myCar = new Car(2021, "красный", "самая классная тачила");
        myCar.info();
        System.out.println(myCar.yearDifference(3067));

        Motorbike moto = new Motorbike(2029, "желтый", "самаый классный байк");
        moto.info();
        System.out.println(myCar.yearDifference(9056));
    }
}
