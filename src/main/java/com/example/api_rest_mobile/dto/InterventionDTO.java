package com.example.api_rest_mobile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterventionDTO {
    private Long id;
    private Long logementId;
    private Long createurId;
    private String date;
    private String heure;
    private Boolean statut;
    private Integer nombreLitsFaits;
}
