//One department can have multiple employees.
//Each employee belongs to exactly one department.
//The relationship is managed by the department property in the Employee entity, which is
//mapped back to the Department entity using the mappedBy attribute in the @OneToMany annotation.


package com.example.demo.entity;



import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;


}

