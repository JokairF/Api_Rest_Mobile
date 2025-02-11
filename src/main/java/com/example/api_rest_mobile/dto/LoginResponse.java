package com.example.api_rest_mobile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    private Long id;
    private String email;
    private String name;
    private String role;
    private String token;
}
