package com.example.api_rest_mobile.dto;

import java.time.LocalDate;
import java.time.LocalTime;
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
    private LocalDate date;
    private LocalTime heure;
    private Boolean statut;
    private Integer nombreLitsFaits;
}
