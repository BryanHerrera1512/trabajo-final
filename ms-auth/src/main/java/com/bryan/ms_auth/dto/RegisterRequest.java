package com.bryan.ms_auth.dto;

import com.bryan.ms_auth.model.Rol;
import lombok.Data;

@Data
public class RegisterRequest {
    private String nombre;
    private String username;
    private String password;
    private Rol rol;
}
