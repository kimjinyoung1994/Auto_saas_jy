package com.example.saas.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserRequest {
    @Email @NotBlank
    private String email;
    @NotBlank
    private String password;
    // getters, setters...
}
