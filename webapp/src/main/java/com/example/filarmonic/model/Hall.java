package com.example.filarmonic.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a concert hall where events take place. Each hall has a
 * name and capacity and may host many concerts.
 */
@Entity
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer capacity;

    @OneToMany(mappedBy = "hall")
    private List<Concert> concerts = new ArrayList<>();

    public Hall() {
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Concert> getConcerts() {
        return concerts;
    }

    public void setConcerts(List<Concert> concerts) {
        this.concerts = concerts;
    }
}