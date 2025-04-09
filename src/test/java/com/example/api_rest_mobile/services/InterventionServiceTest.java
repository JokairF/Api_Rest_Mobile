package com.example.api_rest_mobile.services;

import com.example.api_rest_mobile.dto.LogementDTO;
import com.example.api_rest_mobile.entity.Intervention;
import com.example.api_rest_mobile.entity.Logement;
import com.example.api_rest_mobile.entity.Utilisateur;
import com.example.api_rest_mobile.service.InterventionService;
import com.example.api_rest_mobile.service.LogementService;
import com.example.api_rest_mobile.service.UtilisateurService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class InterventionServiceTest {

    @Autowired
    InterventionService interventionService;

    @Autowired
    UtilisateurService utilisateurService;

    @Autowired
    LogementService logementService;

    @Test
    void setUp() {
    }

    @Test
    void testGetAllInterventions() {
        System.out.println(interventionService.getAllInterventions());
    }

    @Test
    void testGetInterventionById() {
        System.out.println(interventionService.getInterventionById(1L));
    }

    @Test
    void testCreateIntervention() {
        Intervention intervention = new Intervention();
        intervention.setDate("2025-03-24");
        Utilisateur createur = utilisateurService.getUtilisateurById(2L);
        Utilisateur utilisateur = utilisateurService.getUtilisateurById(2L);
        LogementDTO logement = logementService.getLogementById(2L);
        intervention.setHeure("14:30");
        intervention.setStatut(false);
        intervention.setNombreLitsFaits(5);

        Intervention create = interventionService.createIntervention(intervention);
        System.out.println("Intervention créée : " + create);
    }

    @Test
    void testUpdateIntervention() {
        Intervention intervention = interventionService.getInterventionById(1L);

        intervention.setDate("2025-03-25");
        Utilisateur createur = utilisateurService.getUtilisateurById(1L);
        Utilisateur utilisateur = utilisateurService.getUtilisateurById(1L);
        LogementDTO logementDTO = logementService.getLogementById(1L);
        Logement logement = new Logement();
        logement.setId(logementDTO.getId());

        intervention.setCreateur(createur);
        intervention.setUtilisateur(utilisateur);
        intervention.setLogement(logement);
        intervention.setHeure("15:45");
        intervention.setStatut(true);
        intervention.setNombreLitsFaits(10);

        Intervention updated = interventionService.updateIntervention(intervention.getId(), intervention);
        System.out.println("Intervention mise à jour : " + updated);
    }

    @Test
    void testDeleteIntervention() {
        interventionService.deleteIntervention(2L);
        System.out.println("Intervention #2 supprimée");
    }
}