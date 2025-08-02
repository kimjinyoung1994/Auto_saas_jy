package com.example.saas.service;

import com.example.saas.dto.*;
import java.util.List;

public interface ProjectService {
    ProjectResponse create(ProjectRequest request);
    List<ProjectResponse> listByUser(Long userId);
}
