package com.wad.lab2.service;

import com.wad.lab2.model.User;
import com.wad.lab2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
//    TODO implement the methods described in the readme. Note that all crud methods are provided by JPARepository
//     and you can call them directly.
//     Any complex methods must be defined in the repository interface.

    public void howToCallRepositoryMethod(User user) {
        userRepository.save(user);
        userRepository.findAll();
        userRepository.findById(user.getId());
    }
}
