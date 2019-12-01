package com.application.todolist.controllers;

import com.application.todolist.entities.List;
import com.application.todolist.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/list")
@CrossOrigin
public class ListController {
    @Autowired
    private ListRepository listRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    void addList(@RequestBody List list) {
        listRepository.save(list);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<List> getAll() {
        // This returns a JSON or XML with the lists
        return listRepository.findAll();
    }

    @GetMapping(path="/find/{id}")
    public @ResponseBody
    Optional<List> findById(Integer id) {
        return listRepository.findById(id);
    }
}
