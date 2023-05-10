package com.example.sakila.repos;

import com.example.sakila.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    public List<Payment> getCustomerId(int customerId);

    public List<Payment> getByStaffId(int staffId);

    public List<Payment> getByAmount(double staffId);
}