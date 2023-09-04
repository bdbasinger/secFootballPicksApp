package com.basinger.secFootballPicksApp.repos;

import com.basinger.secFootballPicksApp.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    // Add required custom queries later
    List<Game> findByWeekNumber(Integer weekNumber);

}
