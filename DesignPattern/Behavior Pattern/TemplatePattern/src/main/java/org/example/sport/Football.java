package org.example.sport;

public class Football extends Sport{
    @Override
    protected void initialize() {
        System.out.println("Initializing Football");
    }

    @Override
    protected void playing() {
        System.out.println("Playing Football");
    }

    @Override
    protected void showResults() {
        System.out.println("Showing results Football");
    }
}
