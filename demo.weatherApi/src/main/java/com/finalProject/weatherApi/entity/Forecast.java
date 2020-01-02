package com.finalProject.weatherApi.entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "forecast")
public class Forecast {

    @Id
    @Column(name = "forecast_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "weather_status", columnDefinition = "VARCHAR(25)", nullable = false)
    private String weather_status;
    @Column(name = "forecast_day", columnDefinition = "VARCHAR(15)", nullable = true)
    private String day;
    @Column(name = "humidity", nullable = false)
    private int humidity;
    @Column(name = "forecast_minTemp", nullable = false, columnDefinition = "float")
    private double minTemp;
    @Column(name = "forecast_maxTemp", nullable = false)
    private double maxTemp;
    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    public Forecast(){}

    public Forecast(String weather_status, String day, int humidity, double minTemp, double maxTemp){
        this.weather_status = weather_status;
        this.day = day;
        this.humidity = humidity;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }
    public Forecast(String weather_status, String day, int humidity, double minTemp, double maxTemp, City city){
        this.weather_status = weather_status;
        this.day = day;
        this.humidity = humidity;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return weather_status;
    }

    public void setStatus(String status) {
        this.weather_status = status;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getWeather_status() {
        return weather_status;
    }

    public void setWeather_status(String weather_status) {
        this.weather_status = weather_status;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }
}
