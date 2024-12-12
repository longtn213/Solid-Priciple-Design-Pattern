package org.example;

public class SellStockListener implements Observer {
    @Override
    public void update(Float price) {
        if(price>105){
            System.out.println("Selling Stock because S(t) is too high");
        }
    }
}
