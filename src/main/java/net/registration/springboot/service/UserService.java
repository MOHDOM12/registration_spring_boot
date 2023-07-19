package net.registration.springboot.service;

import net.registration.springboot.dto.UserDto;
import net.registration.springboot.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
