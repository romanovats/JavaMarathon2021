package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Димасик", "Кунилингвистическая учебная группа");
        Teacher teacher = new Teacher("Танюшка", "Кунилингвистика");

        System.out.println(student.getClassGroup() + " поздравляет " + student.getName() + "а за самую ахуэную курсовую работу");
        System.out.println("А помогала ему с учебным проектом по предмету '" + teacher.getSubjectName() + "' самая ахйэная училка "+ teacher.getName());
        student.printInfo();
        teacher.printInfo();
    }
}
