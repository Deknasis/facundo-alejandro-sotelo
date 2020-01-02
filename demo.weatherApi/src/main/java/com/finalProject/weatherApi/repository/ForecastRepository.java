package com.finalProject.weatherApi.repository;

import com.finalProject.weatherApi.entity.Forecast;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastRepository extends CrudRepository<Forecast, Integer> {
}
