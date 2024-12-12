package org.example.sport;

public class Basketball extends Sport{
    @Override
    protected void initialize() {
        System.out.println("Initializing Basketball");
    }

    @Override
    protected void playing() {
        System.out.println("Playing Basketball");
    }

    @Override
    protected void showResults() {
        System.out.println("Showing results Basketball");
    }
}
