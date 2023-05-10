package com.example.sakila.services;

import com.example.sakila.model.Inventory;

import java.util.List;

public interface InventoryServices {
    public List<Inventory> getAll();

    public List<Inventory> getById(int id);
    public List<Inventory> getByStoreId(int storeId);
    public List<Inventory> getByFilmId(int filmId);
}
