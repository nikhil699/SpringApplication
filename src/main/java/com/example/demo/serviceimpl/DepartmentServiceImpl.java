package com.example.demo.serviceimpl;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {

        List<Department> result = departmentRepository.findAll();
        return result;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

}
