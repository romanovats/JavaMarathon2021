package day7;

import java.util.Random;

public class Player {

    private int stamina;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player() {
        Random rnd = new Random();
        if (countPlayers < 6) {
            stamina = rnd.nextInt(11) + 90;
            countPlayers++;
            System.out.println(countPlayers);
        } else {
            System.out.println("Создать еще одного игрока нельзя");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run () {
        if (stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игрок устал, пора чиллить, игроков осталось: " + countPlayers);
        } else {
            stamina--;
        }
    }

    public void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + countPlayers + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
