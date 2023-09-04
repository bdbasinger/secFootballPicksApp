package com.basinger.secFootballPicksApp;

import com.basinger.secFootballPicksApp.model.Pick;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PickRepository extends JpaRepository<Pick, Long> {
}
