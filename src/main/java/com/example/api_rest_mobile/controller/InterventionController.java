package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.entity.Intervention;
import com.example.api_rest_mobile.service.InterventionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interventions")
public class InterventionController {
    private final InterventionService interventionService;

    public InterventionController(InterventionService interventionService) {
        this.interventionService = interventionService;
    }

    @GetMapping
    public List<Intervention> getAllInterventions() {
        return interventionService.getAllInterventions();
    }

    @GetMapping("/{id}")
    public Intervention getInterventionById(@PathVariable Long id) {
        return interventionService.getInterventionById(id);
    }

    @GetMapping("/logement/{logementId}")
    public List<Intervention> getInterventionsByLogementId(@PathVariable Long logementId) {
        return interventionService.getInterventionsByLogementId(logementId);
    }

    @GetMapping("/createur/{createurId}")
    public List<Intervention> getInterventionsByCreateurId(@PathVariable Long createurId) {
        return interventionService.getInterventionsByCreateurId(createurId);
    }

    @GetMapping("/utilisateur/{utilisateurId}")
    public List<Intervention> getInterventionsByUtilisateurId(@PathVariable Long utilisateurId) {
        return interventionService.getInterventionsByUtilisateurId(utilisateurId);
    }

    @PostMapping
    public Intervention createIntervention(@RequestBody Intervention intervention) {
        return interventionService.createIntervention(intervention);
    }

    @PutMapping("/{id}")
    public Intervention updateIntervention(@PathVariable Long id, @RequestBody Intervention interventionDetails) {
        return interventionService.updateIntervention(id, interventionDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteIntervention(@PathVariable Long id) {
        interventionService.deleteIntervention(id);
    }
}