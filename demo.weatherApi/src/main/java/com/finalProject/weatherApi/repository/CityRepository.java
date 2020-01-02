package com.finalProject.weatherApi.repository;

import com.finalProject.weatherApi.entity.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {

    @Query(value = "select distinct count(*) AS cities, c.city_name AS cityName " +
            "from city c group by cityName order by cities" +
            " asc limit 5", nativeQuery = true)
    List<String> getTopCities();

    @Query(value = "select distinct count(*) AS cities, c.city_name AS cityName" +
            "from city c group by cityName order by cities" +
            "desc limit 5", nativeQuery = true)
    List<String> getBottomCities();

}
