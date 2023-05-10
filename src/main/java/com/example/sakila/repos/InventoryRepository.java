package com.example.sakila.repos;

import com.example.sakila.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    public List<Inventory> getByStoreId(int storeId);
    public List<Inventory> getByFilmId(int filmId);
}