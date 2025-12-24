package com.example.filarmonic.service;

import java.util.List;

import com.example.filarmonic.model.Hall;

/**
 * Service interface for managing {@link Hall} entities.
 */
public interface HallService {
    /**
     * Retrieve all halls from the repository.
     *
     * @return list of halls
     */
    List<Hall> findAll();

    /**
     * Find a hall by its ID.
     *
     * @param id ID of the hall
     * @return found hall or null
     */
    Hall findById(Long id);

    /**
     * Save or update a hall.
     *
     * @param hall hall to save
     * @return saved hall
     */
    Hall save(Hall hall);

    /**
     * Delete a hall by its ID.
     *
     * @param id ID of the hall
     */
    void deleteById(Long id);
}