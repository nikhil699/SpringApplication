package com.example.demo.serviceimpl;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();LLLLLlllllllllllll
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }
    // Implement other methods
}
