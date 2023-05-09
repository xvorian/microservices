package com.example.sakila.services;

import com.example.sakila.model.Actor;

import java.util.List;
import java.util.Optional;

public interface ActorServices {
    public List<Actor> findAll();
    public Actor findById(Integer Id);
    public Optional<Actor> findByFirstName(String fName);
    public Optional<Actor> findByLastName(String lName);

    public Actor findByName(String firstName, String lastName);

    public Actor addActor(Actor actor);

}
