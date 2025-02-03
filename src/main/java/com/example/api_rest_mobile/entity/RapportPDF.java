package com.example.api_rest_mobile.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class RapportPDF {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Exemple d'association : un rapport est lié à une intervention.
    @ManyToOne
    @JoinColumn(name = "intervention_id", nullable = false)
    private Intervention intervention;

    @Column(nullable = false)
    private String fichier;
}
