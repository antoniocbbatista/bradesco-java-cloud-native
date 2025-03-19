package com.dio.bradesco_java_cloud_native.domain.repository;

import com.dio.bradesco_java_cloud_native.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
