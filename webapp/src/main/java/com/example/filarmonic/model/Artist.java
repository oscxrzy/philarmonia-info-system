package com.example.filarmonic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a performer in the philharmonic. Artists can
 * participate in many concerts and concerts can include many artists.
 */
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 1024)
    private String biography;

    @ManyToMany(mappedBy = "artists")
    private Set<Concert> concerts = new HashSet<>();

    public Artist() {
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Set<Concert> getConcerts() {
        return concerts;
    }

    public void setConcerts(Set<Concert> concerts) {
        this.concerts = concerts;
    }
}