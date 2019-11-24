package com.application.todolist.controllers;

import com.application.todolist.entities.Task;
import com.application.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/task")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addTask(@RequestBody Task task) {
        taskRepository.save(task);
        return "Task saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Task> getAllUsers() {
        // This returns a JSON or XML with the lists
        return taskRepository.findAll();
    }

    @GetMapping(path="/find")
    public @ResponseBody
    Optional<Task> findById(Integer id) {
        return taskRepository.findById(id);
    }
}
