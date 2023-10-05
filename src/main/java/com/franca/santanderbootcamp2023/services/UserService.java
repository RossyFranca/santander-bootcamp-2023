package com.franca.santanderbootcamp2023.services;

import com.franca.santanderbootcamp2023.domains.model.User;

public interface UserService {
    User findById(Long id);
    User create(User user);
}
