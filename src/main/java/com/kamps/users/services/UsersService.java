package com.kamps.users.services;


import com.kamps.users.models.Users;
import com.kamps.users.payload.request.UsersRequest;
import com.kamps.users.payload.response.UsersResponse;

import java.util.List;

public interface UsersService {
    List<UsersResponse> getAllUsers();
    //User getUserById(Integer id);
  Users createUser(UsersRequest usersRequest);
    //void deleteUser(Integer id);
}

