package day5;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike() {
        System.out.println("ты дурак, потому что создал пустой объект");
    }

    public Motorbike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
        System.out.println("го, я создал не пустой объект");
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
