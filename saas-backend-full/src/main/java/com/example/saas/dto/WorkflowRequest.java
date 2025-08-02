package com.example.saas.dto;

import javax.validation.constraints.NotNull;

public class WorkflowRequest {
    @NotNull
    private Long projectId;
    private String triggerType;
    private String actions;
    private String conditions;
    // getters, setters...
}
