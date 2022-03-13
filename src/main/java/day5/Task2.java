package day5;

public class Task2 {
    public static void main(String[] args) {

        Motorbike moto2 = new Motorbike();
        Motorbike moto = new Motorbike(2023, "зеленый", "тачила Татьяны");
        System.out.println(moto.getModel() + ", " + moto.getColor() + ", " + moto.getYearOfIssue());
    }
}
