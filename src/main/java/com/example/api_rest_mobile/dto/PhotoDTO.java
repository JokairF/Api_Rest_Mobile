package com.example.api_rest_mobile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhotoDTO {
    private Long id;
    private Long observationId;
    private String chemin;
}
