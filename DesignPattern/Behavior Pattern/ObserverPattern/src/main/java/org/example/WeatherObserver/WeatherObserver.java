package org.example.WeatherObserver;

public class WeatherObserver implements Observer {
    private int temp;
    private int humidity;
    private int pressure;
    private Subject weatherSubject;

    public WeatherObserver(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.addObserver(this);
    }

    @Override
    public void update(int temp, int pressure, int humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        System.out.println("Temperature: " + this.temp+" Pressure: " + this.pressure + " Humidity: " + this.humidity);
    }
}
