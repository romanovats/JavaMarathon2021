package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random rnd = new Random();
        int markNum = rnd.nextInt(5);
        String mark;

        if (markNum == 5) {
            mark = "Отлично";
        } else if (markNum == 4) {
            mark = "Хорошо";
        } else if (markNum == 3) {
            mark = "Удовлетворительно";
        } else {
            mark = "Неудовлетворительно";
        }
        System.out.println("Преподаватель " +name + " оценил студента с именем " + student.getName() + " по предмету " +
               subject + " на оценку " + mark);

    }
}
