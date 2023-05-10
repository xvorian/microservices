package com.example.sakila.services;

import com.example.sakila.model.Actor;

import java.util.List;
import java.util.Optional;

public interface ActorServices {
    public List<Actor> findAll();
    public Actor findById(Integer Id);
    public Optional<Actor> findByFirstName(String fName);
    public Optional<Actor> findByLastName(String lName);

    Actor findByName(Actor actor);

    public Actor saveActor(Actor actor);

    public Actor updateActor(Actor actor);

    public String deleteActor(Actor actor);

    public Integer updateActorName(Actor actor);

}
