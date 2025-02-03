package com.example.api_rest_mobile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO {
    private Long id;
    private Long interventionId;
    private String message;
    private Boolean lu;
}
