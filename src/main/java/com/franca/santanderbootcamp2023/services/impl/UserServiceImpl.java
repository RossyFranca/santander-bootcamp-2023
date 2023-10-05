package com.franca.santanderbootcamp2023.services.impl;

import com.franca.santanderbootcamp2023.domains.model.User;
import com.franca.santanderbootcamp2023.domains.repository.UserRepository;
import com.franca.santanderbootcamp2023.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber()))
            throw new IllegalArgumentException("This Account number already exists.");

        return userRepository.save(user);
    }
}
