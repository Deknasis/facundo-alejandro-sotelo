
package com.finalProject.weatherApi.extra;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "weather_state_name",
    "applicable_date",
    "min_temp",
    "max_temp",
    "humidity"
})
public class ConsolidatedWeather {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("weather_state_name")
    private String weatherStateName;
    @JsonProperty("applicable_date")
    private String applicableDate;
    @JsonProperty("min_temp")
    private Double minTemp;
    @JsonProperty("max_temp")
    private Double maxTemp;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("weather_state_name")
    public String getWeatherStateName() {
        return weatherStateName;
    }

    @JsonProperty("weather_state_name")
    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    @JsonProperty("applicable_date")
    public String getApplicableDate() {
        return applicableDate;
    }

    @JsonProperty("applicable_date")
    public void setApplicableDate(String applicableDate) {
        this.applicableDate = applicableDate;
    }

    @JsonProperty("min_temp")
    public Double getMinTemp() {
        return minTemp;
    }

    @JsonProperty("min_temp")
    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    @JsonProperty("max_temp")
    public Double getMaxTemp() {
        return maxTemp;
    }

    @JsonProperty("max_temp")
    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
