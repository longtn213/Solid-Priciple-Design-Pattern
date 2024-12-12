package org.example.QueingModelCommand;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algorithm {
    private BlockingQueue<Command> commandQueue;

    public Algorithm() {
        this.commandQueue = new ArrayBlockingQueue<>(10);
    }

    public void produce() throws InterruptedException {
        for (int i = 0; i < 10; i++) commandQueue.add(new TaskSolver(new Task(i+1)));

    }
    public void consume() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            commandQueue.take().execute();
        }
    }
}
