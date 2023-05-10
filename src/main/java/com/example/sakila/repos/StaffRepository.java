package com.example.sakila.repos;

import com.example.sakila.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
    @Query("FROM Staff WHERE email=:email")
    public List<Staff> getStaffByEmail(String email);
}