package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;



@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    // CREATE
    public User addUser(User user) {
        users.add(user);
        return user;
    }

    // READ
    public List<User> getAllUsers() {
        return users;
    }

    // UPDATE
    public User updateUser(int id, User updatedUser) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return user;
            }
        }
        return null;
    }

    // DELETE
    public String deleteUser(int id) {
        users.removeIf(user -> user.getId() == id);
        return "User deleted with id " + id;
    }
}