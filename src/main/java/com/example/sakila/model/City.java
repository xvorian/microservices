package com.example.sakila.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "city")
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "city_id", columnDefinition = "SMALLINT")
    private Integer cityId;

    @Column(name = "city")
    private String city;

    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "country_id", columnDefinition = "SMALLINT")
    private Integer countryId;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;


//    @ManyToOne
//    private Country country;

    public Integer getCityId() {
        return this.cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
