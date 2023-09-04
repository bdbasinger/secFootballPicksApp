package com.basinger.secFootballPicksApp.controller;

import com.basinger.secFootballPicksApp.model.Pick;
import com.basinger.secFootballPicksApp.service.PickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/pick")
public class PickController {

    // Declare the service as final to ensure its immutability
    private final PickService pickService;

    // Use constructor-based dependency injection
    @Autowired
    public PickController(PickService pickService) {
        this.pickService = pickService;
    }

    @GetMapping
    public ResponseEntity<List<Pick>> getAllPicks() {
        return ResponseEntity.ok(pickService.getAllPicks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pick> getPickById(@PathVariable Long id) {
        return pickService.getPickById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Pick> createPick(@RequestBody Pick pick) {
        return ResponseEntity.ok(pickService.savePick(pick));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pick> updatePick(@PathVariable Long id, @RequestBody Pick pick) {
        return ResponseEntity.ok(pickService.savePick(pick));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePick(@PathVariable Long id) {
        pickService.deletePick(id);
        return ResponseEntity.noContent().build();
    }
}


