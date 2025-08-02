package com.example.saas.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import com.example.saas.service.WorkflowService;

@Service
@RequiredArgsConstructor
public class WorkflowServiceImpl implements WorkflowService {

    @Transactional
    public WorkflowResponse create(WorkflowRequest request) {
        // TODO: implement
        return null;
    }

    public List<WorkflowResponse> listByProject(Long projectId) {
        // TODO: implement
        return null;
    }
}
