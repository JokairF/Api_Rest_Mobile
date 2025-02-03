package com.example.api_rest_mobile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "photo")
@Getter
@Setter
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String chemin;

    @ManyToOne
    @JoinColumn(name = "observation_id")
    private Observation observation;
}