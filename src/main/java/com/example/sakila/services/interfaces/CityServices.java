package com.example.sakila.services.interfaces;

import com.example.sakila.model.City;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityServices {
    public List<City> findAll();
    public City findById(Integer Id);

    public City findByName(String name);

    public List<City> getCitiesByCountry(int countryId);
    public List<City> getCitiesInCountries(String countries);
}
