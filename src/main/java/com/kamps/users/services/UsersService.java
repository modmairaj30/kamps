package com.kamps.users.services;


import com.kamps.users.models.Users;

import java.util.List;

public interface UsersService {
    List<Users> getAllUsers();
    //User getUserById(Integer id);
    Users createUser(Users user);
    //void deleteUser(Integer id);
}

