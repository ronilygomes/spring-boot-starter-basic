package com.example.starter.controller;

import com.example.starter.model.User;
import com.example.starter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping(value = "/{index}")
    public User getUser(@PathVariable("index") int index) {
        return this.userService.getUser(index);
    }

    @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
    public void addUser(@RequestBody User user) {
        this.userService.addUser(user);
    }
}
