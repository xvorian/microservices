package com.example.sakila.services.Impl;

import com.example.sakila.model.City;
import com.example.sakila.services.CityServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServicesImpl implements CityServices {
    @Override
    public List<City> findAll() {
        return null;
    }

    @Override
    public City findById(Integer Id) {
        return null;
    }

    @Override
    public City findByName(String name) {
        return null;
    }

    @Override
    public List<City> getCitiesByCountry(int countryId) {
        return null;
    }

    @Override
    public List<City> getCitiesInCountries(String countries) {
        return null;
    }
}
