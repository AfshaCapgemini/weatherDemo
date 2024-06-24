package com.example.demo.controller;

import com.example.demo.model.Weather;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public Weather getWeather(@RequestParam String location) {
        return weatherService.getWeather(location);
    }
}
