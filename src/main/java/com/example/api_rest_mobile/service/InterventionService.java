package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.entity.Intervention;
import com.example.api_rest_mobile.repository.InterventionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InterventionService {
    private final InterventionRepository interventionRepository;

    public InterventionService(InterventionRepository interventionRepository) {
        this.interventionRepository = interventionRepository;
    }

    public List<Intervention> getAllInterventions() {
        return interventionRepository.findAll();
    }

    public Intervention getInterventionById(Long id) {
        return interventionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Intervention non trouvée"));
    }

    public List<Intervention> getInterventionsByLogementId(Long logementId) {
        return interventionRepository.findByLogementId(logementId);
    }

    public List<Intervention> getInterventionsByCreateurId(Long createurId) {
        return interventionRepository.findByCreateurId(createurId);
    }

    public List<Intervention> getInterventionsByUtilisateurId(Long utilisateurId) {
        return interventionRepository.findByUtilisateurId(utilisateurId);
    }

    public Intervention createIntervention(Intervention intervention) {
        return interventionRepository.save(intervention);
    }

    public Intervention updateIntervention(Long id, Intervention interventionDetails) {
        Intervention intervention = interventionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Intervention non trouvée"));
        intervention.setDate(interventionDetails.getDate());
        intervention.setHeure(interventionDetails.getHeure());
        intervention.setStatut(interventionDetails.getStatut());
        return interventionRepository.save(intervention);
    }

    public void deleteIntervention(Long id) {
        interventionRepository.deleteById(id);
    }
}