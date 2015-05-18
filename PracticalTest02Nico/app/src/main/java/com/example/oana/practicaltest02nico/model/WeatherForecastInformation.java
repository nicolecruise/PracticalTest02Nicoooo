package com.example.oana.practicaltest02nico.model;

import com.example.oana.practicaltest02nico.general.Constants;

/**
 * Created by Oana on 18.05.2015.
 */
public class WeatherForecastInformation {


    private String temperature;
    private String windSpeed;
    private String condition;
    private String pressure;
    private String humidity;

    public WeatherForecastInformation() {
        this.temperature = null;
        this.windSpeed = null;
        this.condition = null;
        this.pressure = null;
        this.humidity = null;
    }

    //constructorul
    public WeatherForecastInformation(
            String temperature,
            String windSpeed,
            String condition,
            String pressure,
            String humidity) {
        this.temperature = temperature;
        this.windSpeed   = windSpeed;
        this.condition   = condition;
        this.pressure    = pressure;
        this.humidity    = humidity;
    }

//pentru fiecare atribut fac set si get

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getPressure() {
        return pressure;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getHumidity() {
        return humidity;
    }


    @Override
    public String toString() {
        return Constants.TEMPERATURE + ": " + temperature + "\n\r" +
                Constants.WIND_SPEED + ": " + windSpeed + "\n\r" +
                Constants.CONDITION + ": "+ condition + "\n\r" +
                Constants.PRESSURE + ": "+ pressure + "\n\r" +
                Constants.HUMIDITY + ": " + humidity;
    }

}

