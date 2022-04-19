package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    public static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender().getUsername() == u1.getUsername()) {
                System.out.println(u1.getUsername() + ": " + message.getText());
            } else {
                System.out.println(u2.getUsername() + ": " + message.getText());
            }
        }
    }
}
