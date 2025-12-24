package com.example.filarmonic.repository;

import com.example.filarmonic.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Concert entities. Provides CRUD methods and can
 * declare custom queries if needed.
 */
public interface ConcertRepository extends JpaRepository<Concert, Long> {
}