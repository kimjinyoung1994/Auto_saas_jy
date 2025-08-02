package com.example.saas.service;

import com.example.saas.dto.*;
import java.util.List;

public interface WorkflowService {
    WorkflowResponse create(WorkflowRequest request);
    List<WorkflowResponse> listByProject(Long projectId);
}
