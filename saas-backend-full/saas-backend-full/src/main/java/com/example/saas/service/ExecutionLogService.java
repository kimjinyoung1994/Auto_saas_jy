package com.example.saas.service;

import com.example.saas.dto.ExecutionLogResponse;
import java.util.List;

public interface ExecutionLogService {
    List<ExecutionLogResponse> listByWorkflow(Long workflowId);
}
