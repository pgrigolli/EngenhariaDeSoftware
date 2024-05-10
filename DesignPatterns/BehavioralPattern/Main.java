package BehavioralPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature, float humidity, float pressure);
}

class WeatherStation {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherStation() {
        observers = new ArrayList<>();
    }

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(temperature, humidity, pressure);
        }
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}

class Display implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Display: Nova leitura - Temperatura: " + temperature + " Umidade: " + humidity + " Pressão: " + pressure);
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display display = new Display();

        weatherStation.addObserver(display);

        weatherStation.setMeasurements(25, 60, 1013); // Exemplo
    }
}

