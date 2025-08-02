package com.example.saas.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "execution_logs")
public class ExecutionLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workflow_id", nullable = false)
    private Workflow workflow;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ExecutionResult result;
    @Column(nullable = false)
    private LocalDateTime executedAt;
    @Column(columnDefinition = "TEXT")
    private String inputData;
    @Column(columnDefinition = "TEXT")
    private String outputData;
    // getters, setters, constructors...
}
