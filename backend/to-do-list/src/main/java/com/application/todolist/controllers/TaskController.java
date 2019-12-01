package com.application.todolist.controllers;

import com.application.todolist.entities.Task;
import com.application.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/task")
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    void addTask(@RequestBody Task task) {
        taskRepository.save(task);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Task> getAll() {
        // This returns a JSON or XML with the lists
        return taskRepository.findAll();
    }

    @GetMapping(path="/find/{id}")
    public @ResponseBody
    Optional<Task> findById(Integer id) {
        return taskRepository.findById(id);
    }
}
