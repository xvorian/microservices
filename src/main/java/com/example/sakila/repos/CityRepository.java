package com.example.sakila.repos;

import com.example.sakila.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

    @Query(value = "SELECT * from City WHERE countryId=:countries", nativeQuery = true)
    public List<City> getCitiesInCountries(String countries);
}