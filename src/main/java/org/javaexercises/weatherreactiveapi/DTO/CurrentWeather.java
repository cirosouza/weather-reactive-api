package org.javaexercises.weatherreactiveapi.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentWeather {
    private String time;
    private int interval;
    private double temperature;
    private double windspeed;
    private int winddirection;
    @JsonProperty("is_day")
    private int isDay;
    @JsonProperty("weathercode")
    private int weatherCode;
}