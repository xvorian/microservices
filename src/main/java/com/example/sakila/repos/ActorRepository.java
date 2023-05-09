package com.example.sakila.repos;

import com.example.sakila.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.Optional;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

    @Query("SELECT a FROM Actor a WHERE a.firstName = ?1")
    Optional<Actor> findActorByFirstName(String fName);

    @Query("SELECT a FROM Actor a WHERE a.lastName = ?1")
    Optional<Actor> findActorByLastName(String lName);

    @Query("SELECT a FROM Actor a WHERE a.firstName =?1 and a.lastName=?2")
    Actor findByName(String firstName, String lastName);
}