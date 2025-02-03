package com.example.api_rest_mobile.repository;

import com.example.api_rest_mobile.entity.Logement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogementRepository extends JpaRepository<Logement, Long> {
}
