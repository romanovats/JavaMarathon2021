package day8;

public class Task1 {
    public static void main(String[] args) {

        String row = "";
        StringBuilder sb = new StringBuilder();

        long speed1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            row += i + " ";
        }
        System.out.println(row);
        System.out.println("Время выполнения конкатенации строк: " + (double) (System.currentTimeMillis() - speed1) / 1000);

        long speed2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        System.out.println("Время выполнения StringBuilder: " + (double) (System.currentTimeMillis() - speed2) / 1000);

    }
}
