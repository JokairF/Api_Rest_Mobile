package com.example.api_rest_mobile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "piece")
@Getter
@Setter
public class Piece {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "logement_id")
    private Logement logement;
}