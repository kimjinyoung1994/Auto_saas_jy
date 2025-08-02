package com.example.saas.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.example.saas.dto.*;
import com.example.saas.service.WorkflowService;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/workflows")
@RequiredArgsConstructor
public class WorkflowController {

    private final WorkflowService workflowService;

    @PostMapping
    public WorkflowResponse create(@Valid @RequestBody WorkflowRequest request) {
        return workflowService.create(request);
    }

    @GetMapping("/project/{projectId}")
    public List<WorkflowResponse> listByProject(@PathVariable Long projectId) {
        return workflowService.listByProject(projectId);
    }
}
