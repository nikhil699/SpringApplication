package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Task;

import java.util.List;




public interface DepartmentService {
    List<Department> getAllDepartments();
    Department saveDepartment(Department department);

    List<Task> getAllTasks();

    Task saveTask(Task task);
    // Other methods as needed
}