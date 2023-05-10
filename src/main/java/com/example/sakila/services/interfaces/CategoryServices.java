package com.example.sakila.services.interfaces;

import com.example.sakila.model.Category;

import java.util.List;

public interface CategoryServices {
    public List<Category> getAll();

    public List<Category> getById(int id);

    public List<Category> getByName(String name);
}
