package com.example.ecommerce;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UserService
{


        private final Userrepository userRepository;
@Autowired
    public UserService(Userrepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
            return userRepository.save(user);
        }

        public Optional<User> findByEmail(String email) {
            return userRepository.findByEmail(email);
      }

    }
