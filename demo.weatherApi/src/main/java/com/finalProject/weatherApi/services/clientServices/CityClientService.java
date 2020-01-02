package com.finalProject.weatherApi.services.clientServices;


import com.finalProject.weatherApi.extra.CityWeather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cityInterface", url = "https://www.metaweather.com/api/location")
public interface CityClientService {

    @GetMapping("/{woeid}")
    public CityWeather getCity(@PathVariable long woeid);

    @GetMapping("/search/?query={title}")
    CityWeather getCityByName(@RequestParam String title);
}
