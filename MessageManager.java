package src;

public class MessageManager {
    public void sendMessage(String channel, String message) {
        // Logic for sending a message through a specific channel
        System.out.println("Sending message through " + channel + ": " + message);
    }

    public void receiveMessage(String channel) {
        // Logic for receiving a message from a specific channel
        System.out.println("Receiving message from " + channel);
    }
}
