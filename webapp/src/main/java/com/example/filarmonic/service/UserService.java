package com.example.filarmonic.service;

import java.util.List;

import com.example.filarmonic.model.User;

/**
 * Service interface for managing {@link User} entities and authentication operations.
 */
public interface UserService {
    /**
     * Retrieve all users.
     *
     * @return list of users
     */
    List<User> findAll();

    /**
     * Find a user by ID.
     *
     * @param id user ID
     * @return found user or null
     */
    User findById(Long id);

    /**
     * Save or update a user.
     *
     * @param user user to save
     * @return saved user
     */
    User save(User user);

    /**
     * Delete a user by ID.
     *
     * @param id user ID
     */
    void deleteById(Long id);

    /**
     * Find a user by username.
     *
     * @param username unique username
     * @return found user or null
     */
    User findByUsername(String username);
}