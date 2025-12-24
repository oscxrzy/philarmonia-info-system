package com.example.filarmonic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.filarmonic.model.Role;

/**
 * Repository interface for performing CRUD operations on {@link Role} entities.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    /**
     * Find a role by its name. Spring Data will derive the appropriate query
     * based on the method signature.
     *
     * @param name the role name to search for
     * @return the role with the given name or {@code null} if none exists
     */
    Role findByName(String name);
}