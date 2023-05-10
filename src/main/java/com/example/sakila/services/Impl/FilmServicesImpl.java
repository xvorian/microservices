package com.example.sakila.services.Impl;

import com.example.sakila.model.Film;
import com.example.sakila.services.interfaces.FilmServices;

import java.util.List;

public class FilmServicesImpl implements FilmServices {
    @Override
    public List<Film> getAll() {
        return null;
    }

    @Override
    public List<Film> getById(int id) {
        return null;
    }

    @Override
    public List<Object[]> getFilmDetails(int year, int rentalDuration, String rating) {
        return null;
    }

    @Override
    public Film getMaxReplacementCost() {
        return null;
    }

    @Override
    public Object fetchAggregateData() {
        return null;
    }

    @Override
    public Film getFilmByTitle(String title) {
        return null;
    }

    @Override
    public List<Film> getByReleaseYear(int year) {
        return null;
    }
}
