package com.basinger.secFootballPicksApp.service;

import com.basinger.secFootballPicksApp.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.basinger.secFootballPicksApp.model.User;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user) {
        // You can add additional business logic here
        return userRepository.save(user);
    }

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Additional methods like findById, findAll, delete, etc.
}
