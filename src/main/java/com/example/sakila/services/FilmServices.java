package com.example.sakila.services;

import com.example.sakila.model.Film;

import java.util.List;

public interface FilmServices {

    public List<Film> getAll();

    public List<Film> getById(int id);

    public List<Object[]> getFilmDetails(int year, int rentalDuration, String rating);

    public Film getMaxReplacementCost();

    public Object fetchAggregateData();

    public Film getFilmByTitle(String title);

    public List<Film> getByReleaseYear(int year);
}
