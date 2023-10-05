package com.franca.santanderbootcamp2023.domains.repository;

import com.franca.santanderbootcamp2023.domains.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByAccountNumber(String accountNumber);
}
