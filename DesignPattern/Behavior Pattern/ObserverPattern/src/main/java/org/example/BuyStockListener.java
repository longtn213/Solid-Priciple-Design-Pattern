package org.example;

public class BuyStockListener implements Observer {
    @Override
    public void update(Float price) {
        if(price<95){
            System.out.println("Buying Stock because S(t) is less than 95");
        }
    }
}
