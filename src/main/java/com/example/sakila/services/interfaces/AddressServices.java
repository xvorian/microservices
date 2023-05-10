package com.example.sakila.services.interfaces;

import com.example.sakila.model.Address;

import java.util.List;

public interface AddressServices {
    public List<Address> getAll();

    public List<Address> getById(int id);

    public Address getByAddress(String address);

    public Address getByDistrict(String district);

    public Address getByCity(int cityId);
}
