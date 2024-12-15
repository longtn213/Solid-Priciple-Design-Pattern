package org.example;

public class Main {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("databaseService");
        service.execute();

        service = ServiceLocator.getService("messagingService");
        service.execute();
    }
}