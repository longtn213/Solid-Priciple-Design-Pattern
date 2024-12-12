package org.example.WeatherObserver;

public interface Observer {
    public void update(int temp,int pressure, int humidity);
}
