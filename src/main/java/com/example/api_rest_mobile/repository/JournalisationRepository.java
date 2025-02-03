package com.example.api_rest_mobile.repository;

import com.example.api_rest_mobile.entity.Journalisation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JournalisationRepository extends JpaRepository<Journalisation, Long> {
    List<Journalisation> findByUtilisateurId(Long utilisateurId);
}