package com.demo.kinu.demo.services;

import com.demo.kinu.demo.dtos.UserDto;
import com.demo.kinu.demo.entities.Users;
import com.demo.kinu.demo.mapper.MapUserToUserDto;
import com.demo.kinu.demo.repositories.repoInterfaces.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        Objects.requireNonNull(userRepo, "UserRepo cannot be null");
        this.userRepo = userRepo;
    }

    public List<UserDto> getUsersWithPhoneNumberStartingWithNine() {
        List<Users> users = userRepo.findUsersByPhoneNumberStartingWith("9");
        return MapUserToUserDto.INSTANCE.usersToUserDtos(users);
    }
}
