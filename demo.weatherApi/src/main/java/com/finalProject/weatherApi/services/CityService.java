package com.finalProject.weatherApi.services;


import com.finalProject.weatherApi.entity.City;
import com.finalProject.weatherApi.entity.Forecast;
import com.finalProject.weatherApi.extra.CityWeather;
import com.finalProject.weatherApi.extra.ConsolidatedWeather;
import com.finalProject.weatherApi.repository.CityRepository;
import com.finalProject.weatherApi.services.clientServices.CityClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private CityClientService cityClientService;

    public CityWeather getCity(long id){
        City city = new City(this.cityClientService.getCity(id).getTitle());
        city.setForecast(this.getListForecast(this.cityClientService.getCity(id).getConsolidatedWeather(), city));
        this.cityRepository.save(city);
        return this.cityClientService.getCity(id);
    }

    private List<Forecast> getListForecast(List<ConsolidatedWeather> consolidatedWeather, City city){
        List<Forecast> list = new ArrayList<>();
        for (ConsolidatedWeather x: consolidatedWeather) {
            Forecast forecast = new Forecast(x.getWeatherStateName(), x.getApplicableDate(),
                    x.getHumidity(), x.getMinTemp(), x.getMaxTemp(), city);
            list.add(forecast);
        }
        return list;
    }

    public CityWeather getCityByName(String title){
        return this.cityClientService.getCityByName(title);
    }

    public List<City> getAll(){
        List<City> list = new ArrayList<>();
        this.cityRepository.findAll().forEach(list :: add);
        return list;
    }

    public List<String> getTopCities(){
        return this.cityRepository.getTopCities();
    }

    public List<String> getBottomCities(){
        return this.cityRepository.getBottomCities();
    }

    public Optional<City> getCity(int id){
        return this.cityRepository.findById(id);
    }

    public void save(City city){
        this.cityRepository.save(city);
    }

    public void update(City city){
        this.cityRepository.save(city);
    }

    public void deleteCity(City city){
        this.cityRepository.delete(city);
    }


}
