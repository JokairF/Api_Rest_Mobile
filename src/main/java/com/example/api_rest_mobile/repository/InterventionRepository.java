package com.example.api_rest_mobile.repository;

import com.example.api_rest_mobile.entity.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {
    List<Intervention> findByLogementId(Long logementId);
    List<Intervention> findByCreateurId(Long createurId);
    List<Intervention> findByUtilisateurId(Long utilisateurId);
}