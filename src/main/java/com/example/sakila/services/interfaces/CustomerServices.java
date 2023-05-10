package com.example.sakila.services.interfaces;

import com.example.sakila.model.Customer;

import java.util.List;

public interface CustomerServices {
    public List<Customer> getAll();

    public List<Customer> getById(int id);

    public Customer getByStoreId(int storeId);

    public List<Customer> getByStatus(boolean status);

    public Customer getByEmail(String email);
}
