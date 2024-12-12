package org.example.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private int temp;
    private int humidity;
    private int pressure;
    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(temp, humidity, pressure);
        }
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObservers();
    }
}
