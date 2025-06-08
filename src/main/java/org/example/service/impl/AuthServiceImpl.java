package org.example.service.impl;

import org.example.model.User;
import org.example.repository.impl.UserRepositoryImpl;
import org.example.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Override
    public void register(String username, String password) {
        userRepository.save(new User(username, password));
    }

    @Override
    public boolean login(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }
}
