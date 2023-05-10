package com.example.sakila.repos;

import com.example.sakila.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    public Address getByAddress(String address);

    public Address getByDistrict(String district);

    public Address getByCity(int cityId);
}