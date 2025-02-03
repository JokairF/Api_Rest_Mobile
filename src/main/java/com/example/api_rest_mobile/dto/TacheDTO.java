package com.example.api_rest_mobile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TacheDTO {
    private Long id;
    private Long pieceId;
    private String description;
    private Boolean status;
}
