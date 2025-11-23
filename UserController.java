package com.example.ecommerce;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController
{
        private final UserService userService;
@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
        public ResponseEntity<User> register(@RequestBody User user) {
            return ResponseEntity.ok(userService.register(user));
        }

        @GetMapping("/find")
        public ResponseEntity<User> findByEmail(@RequestParam String email) {
            return ResponseEntity.ok(userService.findByEmail(email).orElseThrow());
     }
    }

