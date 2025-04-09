package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.dto.LogementDTO;
import com.example.api_rest_mobile.service.LogementService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logements")
public class LogementController {

    private final LogementService logementService;

    public LogementController(LogementService logementService) {
        this.logementService = logementService;
    }

    @GetMapping
    public ResponseEntity<List<LogementDTO>> getAllLogements() {
        List<LogementDTO> logements = logementService.getAllLogements();
        return ResponseEntity.ok(logements);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LogementDTO> getLogementById(@PathVariable Long id) {
        LogementDTO logement = logementService.getLogementById(id);
        return ResponseEntity.ok(logement);
    }

    @PostMapping
    public ResponseEntity<LogementDTO> createLogement(@Valid @RequestBody LogementDTO logementDTO) {
        LogementDTO createdLogement = logementService.createLogement(logementDTO);
        return ResponseEntity.ok(createdLogement);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LogementDTO> updateLogement(@PathVariable Long id, @Valid @RequestBody LogementDTO logementDTO) {
        LogementDTO updatedLogement = logementService.updateLogement(id, logementDTO);
        return ResponseEntity.ok(updatedLogement);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLogement(@PathVariable Long id) {
        logementService.deleteLogement(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/adresse/{adresse}")
    public ResponseEntity<LogementDTO> findByAdresse(@PathVariable String adresse) {
        LogementDTO logement = logementService.findByAdresse(adresse);
        return ResponseEntity.ok(logement);
    }
}
