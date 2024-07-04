package com.kamps.users.services;

import com.kamps.users.models.Users;
import com.kamps.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users createUser(Users user) {
        return usersRepository.save(user);
    }

   /* @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }



    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }*/
}

