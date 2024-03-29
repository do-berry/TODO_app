package com.application.todolist.controllers;

import com.application.todolist.entities.User;
import com.application.todolist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/user")
@CrossOrigin
public class UserController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    void addUser(@RequestBody User user) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        // @RequestBody used cause it works
        userRepository.save(user);
    }

    @GetMapping(path="/find/{id}")
    public @ResponseBody
    Optional<User> findUserById(@RequestParam Integer id) {
        return userRepository.findById(id);
    }
}
