package org.example.behavioural.Mediator;

public class Client {

    public static void main(String[] args) {

        ChatMediator chat = new ChatRoom();

        User alice = new ChatUser(chat,"alice");
        User bob = new ChatUser(chat,"bob");
        User charlie = new ChatUser(chat,"charlie");

        chat.addUser(alice);
        chat.addUser(bob);
        chat.addUser(charlie);

        alice.sendMessage("Hi everyone!");
        bob.sendMessage("Hey Alice");



    }

}
