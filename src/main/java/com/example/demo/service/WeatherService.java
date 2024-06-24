package com.example.demo.service;

import com.example.demo.model.Weather;
import com.example.demo.util.WeatherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String apiKey;

    private static final String WEATHER_API_URL="https://api.openweathermap.org/data/2.5/weather";

    @Autowired
    private RestTemplate restTemplate;

    public Weather getWeather(String location) {
        String url = String.format("%s?q=%s&APPID=%s", WEATHER_API_URL, location, apiKey);
        String response = restTemplate.getForObject(url, String.class);

        Weather weather = WeatherMapper.mapToWeather(response);

        return weather;
    }

    private String suggestActivity(double temperature, String description) {
        if (temperature > 25 && description.contains("clear")) {
            return "It's a great day for a walk!";
        } else if (description.contains("rain")) {
            return "How about reading a book indoors?";
        } else if (temperature < 10) {
            return "It's quite cold, maybe stay warm inside.";
        } else {
            return "Enjoy your day!";
        }
    }

}
