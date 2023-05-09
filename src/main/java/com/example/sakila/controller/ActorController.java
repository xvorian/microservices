package com.example.sakila.controller;

import com.example.sakila.model.Actor;
import com.example.sakila.services.ActorServices;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/actor/")
@ApiModel(description = "This Table holds the Actor details....")
public class ActorController {
    @Autowired
    private ActorServices services;

    @GetMapping
    public List<Actor> getAllActor() {
        return services.findAll();
    }

    @GetMapping("{id}")
    @ApiOperation(value="Actor Id", notes="Provides Actor based on Actor Id", response = Actor.class)
    public Actor getById(@PathVariable(value = "id") Integer id) {
        return services.findById(id);
    }

    @GetMapping(value="?firstname={fname}&lastname={lname}")
    public Actor getByName(@RequestParam(value = "fname") String firstName, @RequestParam(value = "lname") String lastName) {
        return new Actor();
    }

    @PostMapping
    public Actor addActor(@RequestBody Actor actor) {
        return services.addActor(actor);
    }

}
