package com.buongermino.parking_API.web.controller;

import com.buongermino.parking_API.entities.User;
import com.buongermino.parking_API.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        User createdUser = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<User> get(@PathVariable Long id) {
        User user = userService.getById(id);
        return ResponseEntity.ok(user);
    }

    @PatchMapping ("/{id}")
    public ResponseEntity<User> updatePassword(@PathVariable Long id, @RequestBody User userRequest) {
        User user = userService.updatePassword(id, userRequest.getPassword());
        return ResponseEntity.ok(user);
    }
}
