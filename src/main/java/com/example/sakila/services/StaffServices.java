package com.example.sakila.services;

import com.example.sakila.model.Staff;

import java.util.List;

public interface StaffServices {
    public List<Staff> getStaffByEmail(String email);
}
