package com.example.filarmonic.service;

import java.util.List;

import com.example.filarmonic.model.Artist;

/**
 * Service interface for managing {@link Artist} entities.
 */
public interface ArtistService {
    /**
     * Retrieve all artists.
     *
     * @return list of artists
     */
    List<Artist> findAll();

    /**
     * Find an artist by ID.
     *
     * @param id ID of the artist
     * @return found artist or null
     */
    Artist findById(Long id);

    /**
     * Save or update an artist.
     *
     * @param artist the artist to save
     * @return saved artist
     */
    Artist save(Artist artist);

    /**
     * Delete an artist by ID.
     *
     * @param id the artist ID
     */
    void deleteById(Long id);
}