package org.example.behavior;

class ForecastDisplay implements Observer {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Forecast Display -> Forecast based on temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}

