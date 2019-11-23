package com.application.todolist.controllers;

import com.application.todolist.entities.Task;
import com.application.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/task")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addTask(@RequestParam(required = false) String description, @RequestParam(required = false) Integer list_id) {
        Task t = new Task();
        t.setDescription(description);
        t.setList_id(list_id);
        taskRepository.save(t);
        return "Task saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Task> getAllUsers() {
        // This returns a JSON or XML with the lists
        return taskRepository.findAll();
    }
}
