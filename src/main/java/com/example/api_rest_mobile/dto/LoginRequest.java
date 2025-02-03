package com.example.api_rest_mobile.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
