package com.example.starter.service;

import com.example.starter.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserService implements UserServiceInterface {

    public List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return this.users;
    }

    public User getUser(int index) {
        try {
            return this.users.get(index);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
