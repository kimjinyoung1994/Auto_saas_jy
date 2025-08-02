package com.example.saas.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.example.saas.dto.*;
import com.example.saas.service.ProjectService;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping
    public ProjectResponse create(@Valid @RequestBody ProjectRequest request) {
        return projectService.create(request);
    }

    @GetMapping("/user/{userId}")
    public List<ProjectResponse> listByUser(@PathVariable Long userId) {
        return projectService.listByUser(userId);
    }
}
