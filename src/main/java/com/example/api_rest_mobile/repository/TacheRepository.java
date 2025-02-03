package com.example.api_rest_mobile.repository;

import com.example.api_rest_mobile.entity.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TacheRepository extends JpaRepository<Tache, Long> {
    List<Tache> findByPieceId(Long pieceId);
}