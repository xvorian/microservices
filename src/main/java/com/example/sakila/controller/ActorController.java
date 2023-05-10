package com.example.sakila.controller;

import com.example.sakila.model.Actor;
import com.example.sakila.response.ResponseHandler;
import com.example.sakila.services.ActorServices;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/byname")
    public Actor getByFirstName(@RequestParam(value = "name") String fname) {
        return services.findByFirstName(fname).get();
    }

    @PostMapping
    public Actor addActor(@RequestBody Actor actor) {
        return services.addActor(actor);
    }

}
