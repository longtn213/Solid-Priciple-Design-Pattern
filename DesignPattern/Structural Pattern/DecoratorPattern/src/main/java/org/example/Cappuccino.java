package org.example;

public class Cappuccino extends BeverageDecorator{
    public Cappuccino(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        // we sup up the costs + $3
        return beverage.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Cappuccino";
    }
}
