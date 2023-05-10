package com.example.sakila.repos;

import com.example.sakila.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query("SELECT releaseYear,rentalDuration,rating FROM Film WHERE releaseYear=:year and rentalDuration=:rentalDuration and rating=:rating")
    public List<Object[]> getFilmDetails(int year, int rentalDuration, String rating);

    @Query("SELECT max(replacementCost) from Film")
    public Film getMaxReplacementCost();

    @Query("SELECT  total(replacementCost), min(rentalDuration), count(length), avg(rentalRate) from Film")
    public Object fetchAggregateData();
}
