package com.example.filarmonic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filarmonic.model.Artist;
import com.example.filarmonic.repository.ArtistRepository;
import com.example.filarmonic.service.ArtistService;

/**
 * Implementation of {@link ArtistService} using a Spring Data repository.
 */
@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    @Override
    public Artist findById(Long id) {
        Optional<Artist> optional = artistRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Artist save(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public void deleteById(Long id) {
        artistRepository.deleteById(id);
    }
}