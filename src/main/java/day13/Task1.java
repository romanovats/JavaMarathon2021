package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Таня");
        User user2 = new User("Дима");
        User user3 = new User("Кто-то");

        MessageDatabase.sendMessage(user1, user2, "Когда же мы уже пройдем этот курс?");
        MessageDatabase.sendMessage(user1, user2, "Чтобы получать 300к в сек");
        MessageDatabase.sendMessage(user2, user1, "Сорян, у меня планы на тусич, учись сама кык");
        MessageDatabase.sendMessage(user1, user2, "Ой все!");

        MessageDatabase.showDialog(user1, user2);
    }
}
