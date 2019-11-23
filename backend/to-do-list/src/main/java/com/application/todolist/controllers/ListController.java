package com.application.todolist.controllers;

import com.application.todolist.entities.List;
import com.application.todolist.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping(path="/list")
public class ListController {
    @Autowired
    private ListRepository listRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addList(@RequestParam(required = false) String name, @RequestParam(required = false) Integer user_id) {
        List l = new List();
        l.setName(name);
        l.setUser_id(user_id);
        l.setDate(LocalDate.now());
        listRepository.save(l);
        return "List saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<List> getAllUsers() {
        // This returns a JSON or XML with the lists
        return listRepository.findAll();
    }
}
