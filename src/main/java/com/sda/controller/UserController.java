package com.sda.controller;

import com.sda.dto.UserDTO;
import com.sda.exception.NotFoundException;
import com.sda.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public void findAll() {
        List<UserDTO> users = userService.findAll();

        if (users.isEmpty()) {
            System.out.println("Users list empty!");
        } else {
            System.out.println("Users list:");
            users.forEach(System.out::println);
        }
    }

    public void findByUsername(String username) {
        try {
            UserDTO user = userService.findByUsername(username);
            System.out.println("User found: " + user);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }
}
