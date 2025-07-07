package org.example.behavioural.Mediator;

public abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    abstract void sendMessage(String msg);
    abstract void receiveMessage(String msg, User sender);

}
