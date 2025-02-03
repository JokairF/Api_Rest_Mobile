package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.entity.Tache;
import com.example.api_rest_mobile.service.TacheService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taches")
public class TacheController {
    private final TacheService tacheService;

    public TacheController(TacheService tacheService) {
        this.tacheService = tacheService;
    }

    @GetMapping
    public List<Tache> getAllTaches() {
        return tacheService.getAllTaches();
    }

    @GetMapping("/{id}")
    public Tache getTacheById(@PathVariable Long id) {
        return tacheService.getTacheById(id);
    }

    @GetMapping("/piece/{pieceId}")
    public List<Tache> getTachesByPieceId(@PathVariable Long pieceId) {
        return tacheService.getTachesByPieceId(pieceId);
    }

    @PostMapping
    public Tache createTache(@RequestBody Tache tache) {
        return tacheService.createTache(tache);
    }

    @PutMapping("/{id}")
    public Tache updateTache(@PathVariable Long id, @RequestBody Tache tacheDetails) {
        return tacheService.updateTache(id, tacheDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTache(@PathVariable Long id) {
        tacheService.deleteTache(id);
    }
}