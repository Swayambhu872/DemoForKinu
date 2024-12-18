package com.demo.kinu.demo.mapper;

import com.demo.kinu.demo.dtos.UserDto;
import com.demo.kinu.demo.entities.Users;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MapUserToUserDto {

    MapUserToUserDto INSTANCE = Mappers.getMapper(MapUserToUserDto.class);

    // Map User to UserDto
    //Only @Mapping when source and target field names are different. If they are same we don't need to
    // use it. Even if the dto has less no of fields as long as the attributes names are same they will be mapped.
    @Mapping(source = "id", target = "id")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    UserDto userToUserDto(Users user);


    List<UserDto> usersToUserDtos(List<Users> users);
}

