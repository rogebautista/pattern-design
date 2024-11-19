package org.example.behavior.observer;


class WeatherStationDisplay implements Observer {
    private float pressure;
    private Subject weatherData;

    public WeatherStationDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Weather Station Display -> Pressure: " + pressure + " hPa");
    }
}

