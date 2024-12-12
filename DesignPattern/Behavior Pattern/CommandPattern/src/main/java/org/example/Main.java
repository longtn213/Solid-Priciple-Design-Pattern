package org.example;

import org.example.QueingModelCommand.Algorithm;

public class Main {
    public static void main(String[] args) {
        //        Switcher switcher = new Switcher();
//
//        Light light = new Light();
//        TurnOnCommand onCommand = new TurnOnCommand(light);
//        TurnOffCommand offCommand = new TurnOffCommand(light);
//
//        switcher.addCommand(onCommand);
//        switcher.addCommand(offCommand);
//
//        switcher.executeCommands();

        final Algorithm algorithm = new Algorithm();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    algorithm.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    algorithm.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
    }
}