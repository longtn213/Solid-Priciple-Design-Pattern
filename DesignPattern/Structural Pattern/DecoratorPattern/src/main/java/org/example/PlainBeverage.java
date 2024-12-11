package org.example;

public class PlainBeverage implements Beverage{
    @Override
    public int getCost() {
        // all the beverage start at $5
        return 5;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
