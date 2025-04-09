package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.entity.Journalisation;
import com.example.api_rest_mobile.service.JournalisationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/journalisations")
public class JournalisationController {
    private final JournalisationService journalisationService;

    public JournalisationController(JournalisationService journalisationService) {
        this.journalisationService = journalisationService;
    }

    @GetMapping
    public List<Journalisation> getAllJournalisations() {
        return journalisationService.getAllJournalisations();
    }

    @GetMapping("/{id}")
    public Journalisation getJournalisationById(@PathVariable Long id) {
        return journalisationService.getJournalisationById(id);
    }

    @GetMapping("/utilisateur/{utilisateurId}")
    public List<Journalisation> getJournalisationsByUtilisateurId(@PathVariable Long utilisateurId) {
        return journalisationService.getJournalisationsByUtilisateurId(utilisateurId);
    }

    @PostMapping
    public Journalisation createJournalisation(@RequestBody Journalisation journalisation) {
        return journalisationService.createJournalisation(journalisation);
    }

    @DeleteMapping("/{id}")
    public void deleteJournalisation(@PathVariable Long id) {
        journalisationService.deleteJournalisation(id);
    }
}