package day9.Task1;

public class Student extends Human {
    private String classGroup;

    public String getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(String classGroup) {
        this.classGroup = classGroup;
    }

    public Student(String name, String classGroup) {
        super(name);
        this.classGroup = classGroup;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}
