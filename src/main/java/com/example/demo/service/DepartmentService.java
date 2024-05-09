package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;


public interface DepartmentService {
    List<Department> getAllDepartments();
    Department saveDepartment(Department department);
    // Other methods as needed
}