package com.example.demo.util;

import com.example.demo.model.Weather;
import org.json.JSONObject;

public class WeatherMapper {

    public static Weather mapToWeather(String jsonResponse) {
        JSONObject jsonObject = new JSONObject(jsonResponse);
        JSONObject main = jsonObject.getJSONObject("main");
        JSONObject wind = jsonObject.getJSONObject("wind");
        String description = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");

        Weather weather = new Weather();
        weather.setTemperature(main.getDouble("temp"));
        weather.setHumidity(main.getInt("humidity"));
        weather.setWindSpeed(wind.getDouble("speed"));
        weather.setDescription(description);

        return weather;
    }
}