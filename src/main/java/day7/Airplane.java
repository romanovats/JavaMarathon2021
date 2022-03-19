package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    public void setYear(int year) {
        this.year = year;
    }

    public void getFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getLength() { return length; }

    public String getProducer() { return producer; }

    public Airplane(String producer, int year, int weight, int length, int fuel) {
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

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Самолет производителя '" + airplane1.getProducer() + "' длиною " + airplane1.getLength() +  " длиннее, чем самолет производителя '"
                    + airplane2.getProducer() + "' длиною " + airplane2.getLength());
        } else {
            System.out.println("2 самолет длиннее, чем 1");
        }
    }
}
