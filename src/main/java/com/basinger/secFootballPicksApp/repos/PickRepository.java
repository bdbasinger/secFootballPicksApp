package com.basinger.secFootballPicksApp.repos;

import com.basinger.secFootballPicksApp.model.Pick;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PickRepository extends JpaRepository<Pick, Long> {
    // Add required custom queries later

}
