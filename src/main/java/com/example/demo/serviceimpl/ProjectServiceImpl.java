package com.example.demo.serviceimpl;

import com.example.demo.entity.Project;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProjects() {
        System.out.println("fMAP-999");
        return projectRepository.findAll();

    }

    @Override
    public Project saveProject(Project project) {
        System.out.println("fMAP-999");
        return projectRepository.save(project);
    }
    // Implement other methods
}
