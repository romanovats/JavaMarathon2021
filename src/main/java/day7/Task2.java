package day7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        Player player7 = new Player();

        int count = player1.getStamina();

        for (int i = 0; i <= count; i++) {
            player1.run();
        }

    }
}
