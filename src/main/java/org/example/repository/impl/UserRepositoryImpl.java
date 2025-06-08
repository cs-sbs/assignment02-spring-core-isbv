package org.example.repository.impl;

import org.example.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl {
    private final Map<String, User> users = new HashMap<>();

    public void save(User user) {
        users.put(user.getUsername(), user);
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}