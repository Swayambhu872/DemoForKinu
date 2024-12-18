package com.demo.kinu.demo.controllers;

import com.demo.kinu.demo.dtos.UserDto;
import com.demo.kinu.demo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/phone-starts-with-nine")
    public ResponseEntity<List<UserDto>> getUsersWithPhoneNumberStartingWithNine() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUsersWithPhoneNumberStartingWithNine());
    }
}
