package com.example.sakila.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "inventory_id", columnDefinition = "SMALLINT")
    private Integer inventoryId;


    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "film_id", columnDefinition = "SMALLINT")
    private Integer filmId;


    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "store_id", columnDefinition = "TINYINT")
    private Integer storeId;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public Integer getInventoryId() {
        return this.inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Integer getFilmId() {
        return this.filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
