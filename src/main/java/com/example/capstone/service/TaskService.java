package com.example.capstone.service;

import com.example.capstone.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    void saveTask(Task task);
    Task getTaskById(long id);
    void deleteTaskById(long id);
}
