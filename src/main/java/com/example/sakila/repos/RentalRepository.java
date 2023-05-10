package com.example.sakila.repos;

import com.example.sakila.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {
    public Rental getByInventoryId(int inventoryId);

    public Rental getByCustomerId(int customerId);

    public List<Rental> getByCity(int staffId);
}