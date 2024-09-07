package org.javaexercises.weatherreactiveapi.service;

import org.javaexercises.weatherreactiveapi.DTO.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    @Autowired
    private WebClient webClient;

    public Mono<WeatherResponse> getWeather(double latitude, double longitude) {
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/forecast")
                        .queryParam("latitude", latitude)
                        .queryParam("longitude", longitude)
                        .queryParam("current_weather", true) // Include current weather data
                        .build())
                .retrieve()
                .bodyToMono(WeatherResponse.class); // Parse response to String or create a DTO for structured response
    }
}
