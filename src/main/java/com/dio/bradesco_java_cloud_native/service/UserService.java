package com.dio.bradesco_java_cloud_native.service;


import com.dio.bradesco_java_cloud_native.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
