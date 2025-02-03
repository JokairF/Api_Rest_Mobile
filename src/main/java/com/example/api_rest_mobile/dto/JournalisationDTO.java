package com.example.api_rest_mobile.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JournalisationDTO {
    private Long id;
    private Long utilisateurId;
    private String action;
    private LocalDateTime date;
    private String details;
}
