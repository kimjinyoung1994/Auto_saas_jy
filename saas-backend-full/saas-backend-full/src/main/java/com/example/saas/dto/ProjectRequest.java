package com.example.saas.dto;

import javax.validation.constraints.NotBlank;

public class ProjectRequest {
    @NotBlank
    private String title;
    private String description;
    // getters, setters...
}
