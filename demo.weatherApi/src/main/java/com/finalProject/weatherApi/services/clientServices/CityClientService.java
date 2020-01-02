package com.finalProject.weatherApi.services.clientServices;


import com.finalProject.weatherApi.extra.CityWeather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Interface to get the information from the outside api
 */
@FeignClient(name = "cityInterface", url = "https://www.metaweather.com/api/location")
public interface CityClientService {

    /**
     *
     * @param woeid param which will be used in order to get the Json Object (meaning = Where On Earth ID)
     * @return the city corresponding to the actual id
     */
    @GetMapping("/{woeid}")
    public CityWeather getCity(@PathVariable long woeid);

    /**
     * Is not functional... Yet; this was a test
     * @param title the corresponding province/city/state name
     * @return the object corresponding to that name; Ideally could be more than one;
     */
    @GetMapping("/search/?query={title}")
    CityWeather getCityByName(@RequestParam String title);
}
