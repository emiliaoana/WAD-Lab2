package com.wad.lab2.controller;

import com.wad.lab2.dto.UserCreateDTO;
import com.wad.lab2.model.User;
import com.wad.lab2.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Operation(
            summary = "Get user by ID",
            description = "Returns a single user based on the provided user ID"
    )
    @GetMapping("/{id}")
    public User getUser(
            @Parameter(
                    description = "ID of the user to retrieve",
                    example = "1",
                    required = true
            )
            @PathVariable Long id
    ) {
        // TODO: implement method to get user by id
        return null;
    }

    @Operation(
            summary = "Get all users",
            description = "Returns a list of all registered users"
    )
    @GetMapping
    public List<User> getUsers() {
        // TODO: implement method to get all users
        return null;
    }

    @Operation(
            summary = "Create a new user",
            description = "Creates a new user using the provided data"
    )
    @PostMapping
    public void saveUser(
            @RequestBody UserCreateDTO user
    ) {
        // TODO: implement method to save a new user
    }

    @Operation(
            summary = "Delete a user",
            description = "Deletes a user based on the provided user ID"
    )
    @DeleteMapping("/{id}")
    public void deleteUser(
            @PathVariable Long id
    ){
        //TODO implement method to delete user
    }

    @Operation(
            summary = "Delete all users",
            description = "Deletes all users"
    )
    @DeleteMapping
    public void deleteUsers(){
        //TODO implement method to delete all users
    }
}
