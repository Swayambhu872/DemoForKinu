package com.demo.kinu.demo.repositories.repoInterfaces;

import com.demo.kinu.demo.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends JpaRepository<Users, Long> {

    Users getUserById(Long id);

    List<Users> getAllUsers();

    Users getUserWithFirstName(String firstName);

    @Query("SELECT u FROM User u WHERE u.phoneNumber LIKE :prefix%")
    List<Users> findUsersByPhoneNumberStartingWith(@Param("prefix") String prefix);
}
