package com.example.saas.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import com.example.saas.service.ExecutionLogService;

@Service
@RequiredArgsConstructor
public class ExecutionLogServiceImpl implements ExecutionLogService {

    public List<ExecutionLogResponse> listByWorkflow(Long workflowId) {
        // TODO: implement
        return null;
    }
}
