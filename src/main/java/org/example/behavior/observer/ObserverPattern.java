package org.example.behavior.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        MobileDeviceDisplay mobileDisplay = new MobileDeviceDisplay(weatherData);
        WeatherStationDisplay stationDisplay = new WeatherStationDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        // Update measurements
        //weatherData.setMeasurements(25.0f, 65.0f, 1013.1f);
        //weatherData.setMeasurements(27.5f, 70.0f, 1012.5f);

        //-- second
        // First set of measurements (both observers are notified)
        System.out.println("First update:");
        weatherData.setMeasurements(25.0f, 65.0f, 1013.1f);

        // Unregister MobileDeviceDisplay
        System.out.println("\nUnregistering MobileDeviceDisplay...");
        weatherData.removeObserver(mobileDisplay);

        // Second set of measurements (only WeatherStationDisplay is notified)
        System.out.println("Second update:");
        weatherData.setMeasurements(27.5f, 70.0f, 1012.5f);
    }
}

