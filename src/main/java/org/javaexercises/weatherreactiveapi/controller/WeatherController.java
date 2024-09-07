package org.javaexercises.weatherreactiveapi.controller;

import org.javaexercises.weatherreactiveapi.DTO.WeatherResponse;
import org.javaexercises.weatherreactiveapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public Mono<WeatherResponse> getWeather(@RequestParam double latitude, @RequestParam double longitude) {
        return weatherService.getWeather(latitude, longitude);
    }
}
