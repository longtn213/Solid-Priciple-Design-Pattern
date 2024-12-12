package org.example.operator;

// abstract layer in between the high level modules and the low level module
public class OperationManager {

    //We have to use composition
    // Because the behavior can be changed at run-tim
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2) {
        this.strategy.execute(num1, num2);
    }
}
