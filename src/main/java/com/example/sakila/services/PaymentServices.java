package com.example.sakila.services;

import com.example.sakila.model.Payment;

import java.util.List;

public interface PaymentServices {
    public List<Payment> getAll();

    public List<Payment> getById(int id);

    public List<Payment> getCustomerId(int customerId);

    public List<Payment> getByStaffId(int staffId);

    public List<Payment> getByAmount(double staffId);
}
