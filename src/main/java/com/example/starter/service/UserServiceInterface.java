package com.example.starter.service;

import com.example.starter.model.User;

import java.util.List;

interface UserServiceInterface {

    List<User> getUsers();

    User getUser(int index);

    void addUser(User user);
}
