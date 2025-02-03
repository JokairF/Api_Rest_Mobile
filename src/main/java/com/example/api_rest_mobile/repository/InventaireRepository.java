package com.example.api_rest_mobile.repository;

import com.example.api_rest_mobile.entity.Inventaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventaireRepository extends JpaRepository<Inventaire, Long> {
    List<Inventaire> findByLogementId(Long logementId);
}