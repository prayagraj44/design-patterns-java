package org.example.behavioural.Mediator;

public interface ChatMediator {

    void addUser(User user);
    void sendMessage(String msg, User sender);


}
