package com.example.api_rest_mobile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RapportPDFDTO {
    private Long id;
    private Long interventionId;
    private String fichier;
}
