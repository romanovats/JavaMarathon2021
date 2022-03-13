package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int weight;
    private int fuel;

    public void getFuel(int fuel) {
        this.fuel = fuel;
    }

    public  Airplane (String producer, int year, int weight, int length, int fuel) {
        this.producer = producer;
        this.year = year;
        this.weight = weight;
        this.length = length;
        this.fuel = fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fuel){
        this.fuel = fuel;
    }
}
