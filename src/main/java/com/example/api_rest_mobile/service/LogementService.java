package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.dto.LogementDTO;
import com.example.api_rest_mobile.entity.Logement;
import com.example.api_rest_mobile.mapper.LogementMapper;
import com.example.api_rest_mobile.repository.LogementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LogementService {

    private final LogementRepository logementRepository;
    private final LogementMapper logementMapper;

    public LogementService(LogementRepository logementRepository, LogementMapper logementMapper) {
        this.logementRepository = logementRepository;
        this.logementMapper = logementMapper;
    }

    public List<LogementDTO> getAllLogements() {
        List<Logement> logements = logementRepository.findAll();
        return logements.stream()
                .map(logementMapper::toDTO)  // Utilisation de l'instance injectée
                .collect(Collectors.toList());
    }

    public LogementDTO getLogementById(Long id) {
        Logement logement = logementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Logement non trouvé"));
        return logementMapper.toDTO(logement);
    }

    public LogementDTO createLogement(LogementDTO logementDTO) {
        Logement logement = logementMapper.toEntity(logementDTO);
        Logement savedLogement = logementRepository.save(logement);
        return logementMapper.toDTO(savedLogement);
    }

    public LogementDTO updateLogement(Long id, LogementDTO logementDTO) {
        Logement existingLogement = logementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Logement non trouvé"));
        // Exemple d'update : mettre à jour les champs existants avec ceux du DTO.
        existingLogement.setNom(logementDTO.getNom());
        existingLogement.setAdresse(logementDTO.getAdresse());
        // Ajoute ici d'autres champs à mettre à jour selon ton entité

        Logement updatedLogement = logementRepository.save(existingLogement);
        return logementMapper.toDTO(updatedLogement);
    }

    public void deleteLogement(Long id) {
        logementRepository.deleteById(id);
    }
}
