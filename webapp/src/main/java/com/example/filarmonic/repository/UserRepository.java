package com.example.filarmonic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.filarmonic.model.User;

/**
 * Repository interface for performing CRUD operations on {@link User} entities.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Find a user by their username. Spring Data automatically generates the
     * necessary query based on the method name.
     *
     * @param username the username to search for
     * @return the user with the given username or {@code null} if none found
     */
    User findByUsername(String username);
}