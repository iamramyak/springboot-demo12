package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping
@AllArgsConstructor
public class UserController {

        private UserService userService;

        @PostMapping
        public ResponseEntity<User> createUser(@RequestBody User user){
            User savedUser= userService.createUser(user);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        }
        @GetMapping("{id}")
        public ResponseEntity<User> getUserById(@PathVariable("id") long userId){
            User user= userService.getUserById(userId);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }

    }

