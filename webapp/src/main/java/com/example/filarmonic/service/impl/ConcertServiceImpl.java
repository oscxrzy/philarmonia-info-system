package com.example.filarmonic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filarmonic.model.Concert;
import com.example.filarmonic.repository.ConcertRepository;
import com.example.filarmonic.service.ConcertService;

/**
 * Implementation of {@link ConcertService} backed by a Spring Data repository.
 */
@Service
public class ConcertServiceImpl implements ConcertService {

    private final ConcertRepository concertRepository;

    @Autowired
    public ConcertServiceImpl(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    @Override
    public List<Concert> findAll() {
        return concertRepository.findAll();
    }

    @Override
    public Concert findById(Long id) {
        Optional<Concert> optional = concertRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Concert save(Concert concert) {
        return concertRepository.save(concert);
    }

    @Override
    public void deleteById(Long id) {
        concertRepository.deleteById(id);
    }
}