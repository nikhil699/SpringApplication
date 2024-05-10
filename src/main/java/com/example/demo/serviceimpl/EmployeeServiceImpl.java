package com.example.demo.serviceimpl;

// EmployeeServiceImpl.java
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();MMMMmmmmmmmmmmmmmmm
    public List<Employee> getAllEmployees() {7777778889hiuygyugyuvyu
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    // Implement other methods
}

// DepartmentServiceImpl.java, ProjectServiceImpl.java, TaskServiceImpl.java

