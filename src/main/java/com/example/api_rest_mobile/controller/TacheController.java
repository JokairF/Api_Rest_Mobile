package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.dto.TacheDTO;
import com.example.api_rest_mobile.service.TacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taches")
@RequiredArgsConstructor
public class TacheController {

    private final TacheService tacheService;

    @GetMapping
    public List<TacheDTO> getAllTaches() {
        return tacheService.getAllTaches();
    }

    @GetMapping("/{id}")
    public TacheDTO getTacheById(@PathVariable Long id) {
        return tacheService.getTacheById(id);
    }

    @GetMapping("/piece/{pieceId}")
    public List<TacheDTO> getTachesByPieceId(@PathVariable Long pieceId) {
        return tacheService.getTachesByPieceId(pieceId);
    }

    @PostMapping
    public TacheDTO createTache(@RequestBody TacheDTO tacheDTO) {
        return tacheService.createTache(tacheDTO);
    }

    @PutMapping("/{id}")
    public TacheDTO updateTache(@PathVariable Long id, @RequestBody TacheDTO tacheDTO) {
        return tacheService.updateTache(id, tacheDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTache(@PathVariable Long id) {
        tacheService.deleteTache(id);
    }
}
