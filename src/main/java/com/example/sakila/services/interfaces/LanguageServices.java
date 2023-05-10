package com.example.sakila.services.interfaces;

import com.example.sakila.model.Inventory;
import com.example.sakila.model.Language;

import java.util.List;

public interface LanguageServices {
    public List<Language> getAll();

    public List<Language> getById(int id);

    public List<Language> getByName(String name);
}
