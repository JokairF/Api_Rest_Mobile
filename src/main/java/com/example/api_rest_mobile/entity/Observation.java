package com.example.api_rest_mobile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "observation")
@Getter
@Setter
public class Observation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commentaire;

    @ManyToOne
    @JoinColumn(name = "intervention_id")
    private Intervention intervention;

    private Boolean photoObligatoire;
}