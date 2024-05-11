package com.example.demo.serviceimpl;

import com.example.demo.entity.Department;
import com.example.demo.entity.Task;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Department> getAllDepartments() {
        return List.of();
    }

    @Override
    public Department saveDepartment(Department department) {
        return null;
    }

    @Override
    public List<Task> getAllTasks() {
        taskRepository.findAll();

        System.out.println("fMAP-888");
        return taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        taskRepository.findAll();

        System.out.println("MAP-888");
        return taskRepository.save(task);
    }

}
