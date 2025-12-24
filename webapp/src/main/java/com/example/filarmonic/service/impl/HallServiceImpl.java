package com.example.filarmonic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filarmonic.model.Hall;
import com.example.filarmonic.repository.HallRepository;
import com.example.filarmonic.service.HallService;

/**
 * Implementation of {@link HallService} backed by a Spring Data repository.
 */
@Service
public class HallServiceImpl implements HallService {

    private final HallRepository hallRepository;

    @Autowired
    public HallServiceImpl(HallRepository hallRepository) {
        this.hallRepository = hallRepository;
    }

    @Override
    public List<Hall> findAll() {
        return hallRepository.findAll();
    }

    @Override
    public Hall findById(Long id) {
        Optional<Hall> optional = hallRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Hall save(Hall hall) {
        return hallRepository.save(hall);
    }

    @Override
    public void deleteById(Long id) {
        hallRepository.deleteById(id);
    }
}