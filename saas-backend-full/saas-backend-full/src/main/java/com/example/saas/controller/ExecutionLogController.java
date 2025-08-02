package com.example.saas.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.example.saas.dto.ExecutionLogResponse;
import com.example.saas.service.ExecutionLogService;
import java.util.List;

@RestController
@RequestMapping("/api/logs")
@RequiredArgsConstructor
public class ExecutionLogController {

    private final ExecutionLogService executionLogService;

    @GetMapping("/workflow/{workflowId}")
    public List<ExecutionLogResponse> listByWorkflow(@PathVariable Long workflowId) {
        return executionLogService.listByWorkflow(workflowId);
    }
}
