package com.example.demo.model;

public class Weather {
    private double temperature;
    private int humidity;
    private double windSpeed;
    private String description;
    private String activitySuggestion;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActivitySuggestion() {
        return activitySuggestion;
    }

    public void setActivitySuggestion(String activitySuggestion) {
        this.activitySuggestion = activitySuggestion;
    }
}
