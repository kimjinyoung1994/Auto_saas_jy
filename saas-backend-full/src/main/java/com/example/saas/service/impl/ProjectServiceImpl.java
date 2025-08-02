package com.example.saas.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import com.example.saas.service.ProjectService;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    @Transactional
    public ProjectResponse create(ProjectRequest request) {
        // TODO: implement
        return null;
    }

    public List<ProjectResponse> listByUser(Long userId) {
        // TODO: implement
        return null;
    }
}
