package com.example.sakila.repos;

import com.example.sakila.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query("FROM Country WHERE country in (:name, :name1,:name2) order by country desc")
    public List<Country> getCountriesByName(String name, String name1, String name3);
}