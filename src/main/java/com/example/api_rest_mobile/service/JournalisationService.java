package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.entity.Journalisation;
import com.example.api_rest_mobile.repository.JournalisationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JournalisationService {
    private final JournalisationRepository journalisationRepository;

    public JournalisationService(JournalisationRepository journalisationRepository) {
        this.journalisationRepository = journalisationRepository;
    }

    public List<Journalisation> getAllJournalisations() {
        return journalisationRepository.findAll();
    }

    public Journalisation getJournalisationById(Long id) {
        return journalisationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Journalisation non trouvée"));
    }

    public List<Journalisation> getJournalisationsByUtilisateurId(Long utilisateurId) {
        return journalisationRepository.findByUtilisateurId(utilisateurId);
    }

    public Journalisation createJournalisation(Journalisation journalisation) {
        return journalisationRepository.save(journalisation);
    }

    public void deleteJournalisation(Long id) {
        journalisationRepository.deleteById(id);
    }
}