package com.example.api_rest_mobile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(
        name = "intervention",
        indexes = {
                @Index(name = "idx_intervention_logement", columnList = "logement_id"),
                @Index(name = "idx_intervention_createur", columnList = "createur_id")
        }
)
@Getter
@Setter
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private String heure;
    private Boolean statut;

    @ManyToOne
    @JoinColumn(name = "logement_id")
    private Logement logement;

    @ManyToOne
    @JoinColumn(name = "createur_id")
    private Utilisateur createur;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}