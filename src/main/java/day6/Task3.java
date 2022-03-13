package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student("Дмитрий Лиханов");
        Teacher teacher1 = new Teacher("Татьяна Романова", "погромирование");
        teacher1.evaluate(student1);
    }
}
