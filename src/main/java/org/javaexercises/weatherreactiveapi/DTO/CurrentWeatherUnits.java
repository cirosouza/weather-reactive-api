package org.javaexercises.weatherreactiveapi.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentWeatherUnits {
    private String time;
    private String interval;
    private String temperature;
    private String windspeed;
    private String winddirection;
    @JsonProperty("is_day")
    private String isDay;
    @JsonProperty("weathercode")
    private String weatherCode;
}