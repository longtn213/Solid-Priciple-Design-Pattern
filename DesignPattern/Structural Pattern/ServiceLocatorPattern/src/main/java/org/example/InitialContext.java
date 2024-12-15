package org.example;

public class InitialContext {
    public Object lookup(String jndiName) {
        switch (jndiName) {
            case DatabaseService.NAME:
                return new DatabaseService();
            case MessageService.NAME:
                return new MessageService();
            default:
                return null;
        }
    }

}

