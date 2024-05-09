package com.example.demo.repository;

// TaskRepository.java
import com.example.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {
}
