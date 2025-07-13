package com.bryan.ms_auth.dto;

import com.bryan.ms_auth.model.Rol;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValidateResponse {
    private String email;
    private Rol rol;
}
