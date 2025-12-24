package com.example.filarmonic.service;

import java.util.List;

import com.example.filarmonic.model.Role;

/**
 * Service interface for managing {@link Role} entities.
 */
public interface RoleService {
    /**
     * Retrieve all roles.
     *
     * @return list of roles
     */
    List<Role> findAll();

    /**
     * Find a role by ID.
     *
     * @param id role ID
     * @return found role or null
     */
    Role findById(Long id);

    /**
     * Save or update a role.
     *
     * @param role role to save
     * @return saved role
     */
    Role save(Role role);

    /**
     * Delete a role by ID.
     *
     * @param id role ID
     */
    void deleteById(Long id);

    /**
     * Find a role by its name.
     *
     * @param name unique role name
     * @return found role or null
     */
    Role findByName(String name);
}