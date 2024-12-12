package org.example.QueingModelCommand;

public class Task {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void solveProblem(){
        System.out.println("solveProblem with ID "+ id);
    }
}
