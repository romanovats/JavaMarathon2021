package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Романова эйрлайн", 1994, 56, 170, 14);
        Airplane airplane2 = new Airplane("Лиханов эйрлайн", 1995, 70, 168, 28);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}