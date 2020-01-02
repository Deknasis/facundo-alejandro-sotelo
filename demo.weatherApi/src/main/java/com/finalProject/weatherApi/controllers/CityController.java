package com.finalProject.weatherApi.controllers;


import com.finalProject.weatherApi.entity.City;
import com.finalProject.weatherApi.extra.CityWeather;
import com.finalProject.weatherApi.services.CityService;
import com.finalProject.weatherApi.services.clientServices.CityClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/{woeid}")
    public CityWeather getCity(@PathVariable long woeid){
        return this.cityService.getCity(woeid);
    }

    @GetMapping("/search/?query={title}")
    public CityWeather getCityByName(@RequestParam String title){
        return this.cityService.getCityByName(title);
    }

    @GetMapping("/search/topCities")
    public List<String> topCities(){
        return this.cityService.getTopCities();
    }
    @GetMapping("/search/bottomCities")
    public List<String> bottomCities(){
        return this.cityService.getBottomCities();
    }



}
