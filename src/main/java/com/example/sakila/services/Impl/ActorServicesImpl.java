package com.example.sakila.services.Impl;

import com.example.sakila.exception.ResourceNotFoundCustomException;
import com.example.sakila.model.Actor;
import com.example.sakila.repos.ActorRepository;
import com.example.sakila.services.interfaces.ActorServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ActorServicesImpl implements ActorServices {

    @Autowired
    private ActorRepository repo;

    @Override
    public List<Actor> findAll() {
        return repo.findAll();
    }

    @Override
    public Actor findById(Integer Id) {
        if (repo.findById(Id).isEmpty()) {
            throw new ResourceNotFoundCustomException("Requested Actor doesnt Exist");
        }
        return repo.findById(Id).get();
    }

    @Override
    public Optional<Actor> findByFirstName(String fName) {
        return repo.findAll().stream().filter(a -> a.getFirstName().equalsIgnoreCase(fName)).findFirst();

    }

    @Override
    public Optional<Actor> findByLastName(String lName) {
//        return repo.findAll().stream().filter(a -> a.getFirstName().equalsIgnoreCase(lName)).findFirst();
        return repo.findActorByLastName(lName);
    }

    @Override
    public Actor saveActor(Actor actor) {
        return repo.save(actor);
    }

    @Override
    public Actor updateActor(Actor actor) {
        return repo.save(actor);
    }

    @Override
    public String deleteActor(Actor actor) {
        repo.delete(actor);
        return "Deleted Successfully";
    }

    @Override
    @Transactional
    public Integer updateActorName(Actor actor) {
        return repo.updateActorName(actor.getActorId(), actor.getFirstName());
    }

    @Override
    public Optional<Actor> findActorByLastName(String lName) {
        return Optional.empty();
    }

    @Override
    public Actor findByName(String firstName, String lastName) {
        return null;
    }

    @Override
    public Integer updateActorName(Integer id, String firstname) {
        return null;
    }

    @Override
    public Optional<Actor> findActorByFirstName(String fName) {
        return repo.findActorByFirstName(fName);
    }

    @Override
    public Actor findByName(Actor actor) {
        return repo.findByName(actor.getFirstName(), actor.getLastName());
    }
}
