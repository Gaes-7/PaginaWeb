package com.example.demo.controller;

import com.example.demo.Entity.User;
import com.example.demo.service.imp.UserService;
import com.example.demo.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/User")
public class UserController {

    @Autowired
    private UserService UserService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO idUsurios) {
        User user = UserService.create(idUsurios);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = UserService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{idUsuarios}")
    public ResponseEntity<User> getUserById(@PathVariable Long idUsuarios) {
        User user = UserService.findById(idUsuarios);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/{idUsuarios}")
    public ResponseEntity<User> updateUser(@PathVariable UserDTO idUsuarios, @RequestBody UserDTO userDTO) {
        User user = UserService.update(idUsuarios);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{idUsuarios}")
    public ResponseEntity<Void> deleteUser(@PathVariable UserDTO idUsuarios) {
        User User = UserService.delete(idUsuarios.getId());
        return ResponseEntity.noContent().build();
    }
}

