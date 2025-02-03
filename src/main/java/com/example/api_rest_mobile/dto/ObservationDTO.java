package com.example.api_rest_mobile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObservationDTO {
    private Long id;
    private Long pieceId;
    private String commentaire;
    private Boolean photoObligatoire;
}
