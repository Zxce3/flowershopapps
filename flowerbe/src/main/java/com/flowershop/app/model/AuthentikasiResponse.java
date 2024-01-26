package com.flowershop.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthentikasiResponse {
    
    private String status;
    private String message;
    private String token; 
}