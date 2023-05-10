package com.example.sakila.services;

import com.example.sakila.model.Rental;

import java.util.List;

public interface RentalServices {
    public List<Rental> getAll();

    public List<Rental> getById(int id);

    public Rental getByInventoryId(int inventoryId);

    public Rental getByCustomerId(int customerId);

    public List<Rental> getByCity(int staffId);
}
