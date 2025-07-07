package org.example.behavioural.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

    List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String msg, User sender) {

        for(User user: users){
            if(user != sender){
                user.receiveMessage(msg,sender);
            }
        }

    }
}
