package com.franca.santanderbootcamp2023.controllers;

import com.franca.santanderbootcamp2023.domains.model.User;
import com.franca.santanderbootcamp2023.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }



    //TODO: criar DTO's
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
            var userCreated =  userService.create(user);
            URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}").buildAndExpand(userCreated.getId()).toUri();
            return ResponseEntity.created(location).body(userCreated);
    }
}
