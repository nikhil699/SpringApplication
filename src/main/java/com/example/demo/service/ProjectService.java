package com.example.demo.service;

import com.example.demo.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getAllProjects();
    Project saveProject(Project project);
    // Other methods as needed
}
