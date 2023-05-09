package com.example.sakila.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "film")
public class Film implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "film_id", columnDefinition = "SMALLINT")
    private Integer filmId;

    @Column(name = "title")
    private String title;

    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;


    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "release_year", columnDefinition = "SMALLINT")
    private Integer releaseYear;


    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "language_id", columnDefinition = "TINYINT")
    private Integer languageId;


    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "original_language_id", columnDefinition = "TINYINT")
    private Integer originalLanguageId;

    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "rental_duration", columnDefinition = "TINYINT")
    private BigDecimal rentalDuration;

    @Column(name = "rental_rate")
    private BigDecimal rentalRate;


    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "length", columnDefinition = "SMALLINT")
    private Integer length;

    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;


    @Column(name = "rating")
    private String rating;

    @Column(name = "special_features")
    private String specialFeatures;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public Integer getFilmId() {
        return this.filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getOriginalLanguageId() {
        return this.originalLanguageId;
    }

    public void setOriginalLanguageId(Integer originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public BigDecimal getRentalDuration() {
        return this.rentalDuration;
    }

    public void setRentalDuration(BigDecimal rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return this.rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return this.replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return this.specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
