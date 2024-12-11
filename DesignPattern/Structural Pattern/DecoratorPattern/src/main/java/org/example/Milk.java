package org.example;

public class Milk extends BeverageDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        // we sup up the costs + $3
        return beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "milk";
    }
}
