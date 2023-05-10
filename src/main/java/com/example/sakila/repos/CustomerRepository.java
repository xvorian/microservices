package com.example.sakila.repos;

import com.example.sakila.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    // Positional Parameters
    @Query("FROM Customer WHERE customerId>=?1 and customerId<=?2")
    public List<Customer> customerByEmployeeRange(int min, int max);

    @Query("FROM Customer WHERE storeId=:storeId")
    public List<Customer> customerByStoreId(int storeId);

    //Named Parameter
    @Query("SELECT c FROM Customer c WHERE c.firstName=:firstName and c.lastName=:lastname")
    public Customer customerByName(String firstname, String lastname);


    @Query("SELECT c FROM Customer c WHERE c.email=:email")
    public Customer customerByEmail(String email);

    @Query("SELECT c FROM Customer c WHERE c.active=:status")
    public List<Customer> customerByStatus(boolean status);

}