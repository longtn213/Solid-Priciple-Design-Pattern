package org.example;

public class Main {
    public static void main(String[] args) {
//        WeatherStation station = new WeatherStation();
//        WeatherObserver s2 = new WeatherObserver(station);
//        station.setHumidity(100);
//        station.setPressure(150);
//        station.setTemp(1233);
        StockExchange stockExchange = new StockExchange();
        stockExchange.addObserver(new BuyStockListener());
        stockExchange.addObserver(new SellStockListener());
        stockExchange.start();
    }
}