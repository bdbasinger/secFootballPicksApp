package com.basinger.secFootballPicksApp.repos;

import com.basinger.secFootballPicksApp.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    // Add required custom queries later

}
