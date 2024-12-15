package org.example;

public class MessageService implements Service{

    public static final String NAME="messagingService";


    @Override
    public String getName() {
        return MessageService.NAME ;
    }

    @Override
    public void execute() {
        System.out.println("Executing messaging service...");
    }
}
