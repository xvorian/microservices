package com.example.sakila.controller;

import com.example.sakila.model.Actor;
import com.example.sakila.helper.ResponseHandler;
import com.example.sakila.services.ActorServices;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actor")
@ApiModel(description = "This Table holds the Actor details....")
public class ActorController {
    @Autowired
    private ActorServices services;

    @GetMapping
    public ResponseEntity<Object> getAllActor() {
        return ResponseHandler.responseBuilder("Returning all Actors", HttpStatus.OK, services.findAll());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Actor Id", notes = "Provides Actor based on Actor Id", response = Actor.class)
    public ResponseEntity<Object> getById(@PathVariable(value = "id") Integer id) {
        return ResponseHandler.responseBuilder("Requested Actor Details", HttpStatus.OK, services.findById(id));
    }

    @GetMapping(value = "/name")
    public Actor getActorByName(@RequestParam(value = "firstname") String firstname, @RequestParam(value = "lastname") String lastname) {
        return services.findByName(new Actor(firstname, lastname));
    }

    @PostMapping
    public ResponseEntity<Object> addActor(@RequestBody Actor actor) {
        return ResponseHandler.responseBuilder("Actor Updated", HttpStatus.CREATED, services.saveActor(actor));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> updateActorDetails(@PathVariable(value = "id") Integer id, @RequestBody Actor actor) {
        actor.setActorId(id);
        return ResponseHandler.responseBuilder("Actor Details Updated", HttpStatus.OK, services.updateActorName(actor));
    }
}
