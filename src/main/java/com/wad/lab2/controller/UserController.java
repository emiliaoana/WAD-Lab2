package com.wad.lab2.controller;

import com.wad.lab2.dto.UserCreateDTO;
import com.wad.lab2.model.User;
import com.wad.lab2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        //TODO: implement method to get user by id
        return null;
    }

    @GetMapping
    public List<User> getUsers() {
        //TODO: implement method to get all users
        return null;
    }

    @PostMapping
    public void saveUser(@RequestBody UserCreateDTO user) {
        //TODO: implement method to save a new user
    }
}
