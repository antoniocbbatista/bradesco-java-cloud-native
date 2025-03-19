package com.dio.bradesco_java_cloud_native.service.impl;

import com.dio.bradesco_java_cloud_native.domain.model.User;
import com.dio.bradesco_java_cloud_native.domain.repository.UserRepository;
import com.dio.bradesco_java_cloud_native.service.UserService;

import java.util.NoSuchElementException;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
