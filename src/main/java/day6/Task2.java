package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane air = new Airplane("ЗОВОД", 1974, 10000, 27890, 0);
        System.out.print("Информация изначального объекта: ");
        air.info();

        air.setLength(9999);
        air.setYear(2022);
        air.fillUp(699);
        System.out.print("Информация измененного объекта: ");
        air.info();
        air.fillUp(809);
        System.out.print("Информация измененного объекта: ");
        air.info();




    }
}
