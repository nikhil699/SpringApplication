package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    // Getters and setters
}
