package com.example.filarmonic.service;

import java.util.List;

import com.example.filarmonic.model.Concert;

/**
 * Service interface for managing {@link Concert} entities.
 */
public interface ConcertService {
    /**
     * Retrieve all concerts from the repository.
     *
     * @return a list of all concerts
     */
    List<Concert> findAll();

    /**
     * Find a concert by its unique identifier.
     *
     * @param id the concert ID
     * @return the found concert or {@code null} if none exists
     */
    Concert findById(Long id);

    /**
     * Persist a new or updated concert.
     *
     * @param concert the concert to save
     * @return the saved concert
     */
    Concert save(Concert concert);

    /**
     * Delete a concert by its ID.
     *
     * @param id the ID of the concert to remove
     */
    void deleteById(Long id);
}