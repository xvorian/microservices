package com.example.sakila.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "actor")
@ToString
@Getter
@Setter
public class Actor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "actor_id", columnDefinition = "SMALLINT")
    private Integer actorId;

    @Column(name = "first_name")
    @ApiModelProperty(notes = "This is Actor First Name")
    private String firstName;

    @Column(name = "last_name")
    @ApiModelProperty(notes = "This is Actor Last Name")
    private String lastName;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;

    public Actor(Integer actorId, String firstName, String lastName, LocalDateTime lastUpdate) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor() {
    }
}
