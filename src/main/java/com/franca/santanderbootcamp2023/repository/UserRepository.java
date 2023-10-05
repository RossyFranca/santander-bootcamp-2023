package com.franca.santanderbootcamp2023.repository;

import com.franca.santanderbootcamp2023.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}