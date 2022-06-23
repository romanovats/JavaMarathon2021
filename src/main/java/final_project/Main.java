package final_project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // System.out.println("\uD83D\uDEA2");
        String[][] map1 = new String[10][10];
        int coord1, coord2, coord3, coord4, count = 1;
        Scanner scanner = new Scanner(System.in);

        while (count !=5) {
            System.out.println("Введите координаты " + count + " однопалубного корабля (формат: x,y)");
            String[] xy = scanner.nextLine().split(",");
            coord1 = Integer.parseInt(xy[0]);
            coord2 = Integer.parseInt(xy[1]);
            map1[coord1][coord2] = "\uD83D\uDEA2";
            count++;
        } count = 1;

        while (count != 4) {
            System.out.println("Введите координаты " + count + " двухпалубного корабля (формат: x,y;x,y)");
            String[] xy = scanner.nextLine().split(";");
            for (int i = 0; i< xy.length; i++) {
                coord1 = Integer.parseInt(xy[i].split(",")[0]);
                coord2 = Integer.parseInt(xy[i].split(",")[1]);
                map1[coord1][coord2] = "\uD83D\uDEA2";
            }
            count++;
        } count = 1;

        while (count != 3) {
            System.out.println("Введите координаты " + count + " трехпалубного корабля (формат: x,y;x,y;x,y)");
            String[] xy = scanner.nextLine().split(";");
            for (int i = 0; i< xy.length; i++) {
                coord1 = Integer.parseInt(xy[i].split(",")[0]);
                coord2 = Integer.parseInt(xy[i].split(",")[1]);
                map1[coord1][coord2] = "\uD83D\uDEA2";
            }
            count++;
        } count = 1;

        while (count != 2) {
            System.out.println("Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)");
            String[] xy = scanner.nextLine().split(";");
            for (int i = 0; i< xy.length; i++) {
                coord1 = Integer.parseInt(xy[i].split(",")[0]);
                coord2 = Integer.parseInt(xy[i].split(",")[1]);
                map1[coord1][coord2] = "\uD83D\uDEA2";
            }
            count++;
        }

        scanner.close();

        for (int i =0; i<map1[0].length; i++) {
            for (int j=0; j<map1[0].length; j++) {
                if(map1[i][j] == null) {
                    map1[i][j] = "⬜";
                    System.out.print(map1[i][j] + " ");
                } else
                System.out.print(map1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
