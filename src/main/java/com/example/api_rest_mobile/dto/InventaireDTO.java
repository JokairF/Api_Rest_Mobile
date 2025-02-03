package com.example.api_rest_mobile.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventaireDTO {
    private Long id;
    private Long logementId;
    private String description;
    private Integer quantite;
    private LocalDate date;
}
