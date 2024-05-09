package com.example.demo.service;

import com.example.demo.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task saveTask(Task task);
    // Other methods as needed
}
