package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("самая крутая тачила");
        myCar.setColor("Небесно-голубой");
        myCar.setYearOfIssue(2199);
        System.out.println("У Татьяны " + myCar.getModel() + ", цвет: " + myCar.getColor() + "," + myCar.getYearOfIssue() + " года выпуска");

    }
}
