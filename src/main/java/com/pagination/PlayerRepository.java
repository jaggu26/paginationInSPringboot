package com.pagination;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Custom query methods if needed, but JpaRepository already provides most CRUD operations
    Page<Player> findAll(Pageable pageable); // This method supports pagination
}
