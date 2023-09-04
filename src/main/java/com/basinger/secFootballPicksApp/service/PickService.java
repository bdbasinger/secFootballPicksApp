package com.basinger.secFootballPicksApp.service;

import com.basinger.secFootballPicksApp.repos.PickRepository;
import com.basinger.secFootballPicksApp.model.Pick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PickService {

    // Declare the repository as final to ensure its immutability
    private final PickRepository pickRepository;

    // Use constructor-based dependency injection
    @Autowired
    public PickService(PickRepository pickRepository) {
        this.pickRepository = pickRepository;
    }

    public List<Pick> getAllPicks() {
        return pickRepository.findAll();
    }

    public Optional<Pick> getPickById(Long id) {
        return pickRepository.findById(id);
    }

    public Pick savePick(Pick pick) {
        return pickRepository.save(pick);
    }

    public void deletePick(Long id) {
        pickRepository.deleteById(id);
    }

    public void saveAll(List<Pick> submittedPicks) {
        pickRepository.saveAll(submittedPicks);
    }
}
