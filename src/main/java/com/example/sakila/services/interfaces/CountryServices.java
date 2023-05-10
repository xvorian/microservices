package com.example.sakila.services.interfaces;

import com.example.sakila.model.Country;

import java.util.List;

public interface CountryServices {

    public List<Country> getAll();
    public Country getById(int Id);

    public Country getByName(String name);
    public List<Country> getCountriesByName(String name, String name1, String name3);
}
