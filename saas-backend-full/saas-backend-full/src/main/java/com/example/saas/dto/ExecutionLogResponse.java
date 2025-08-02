package com.example.saas.dto;

import java.time.LocalDateTime;

public class ExecutionLogResponse {
    private Long id;
    private Long workflowId;
    private String result;
    private LocalDateTime executedAt;
    private String inputData;
    private String outputData;
    // getters, setters, constructors...
}
