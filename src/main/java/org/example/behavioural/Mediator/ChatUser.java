package org.example.behavioural.Mediator;

public class ChatUser extends User{

    public ChatUser(ChatMediator mediator, String name){
        super(mediator,name);
    }

    @Override
    void sendMessage(String msg) {
        System.out.println("%s is sending message: [%s] ".formatted(this.name,msg));
        mediator.sendMessage(msg,this);
    }

    @Override
    void receiveMessage(String msg, User sender) {
        System.out.println("%s received message: [%s] from %s".formatted(this.name,msg,sender.name));
    }
}
