package com.kamps.users.services;

import com.kamps.images.models.Image;
import com.kamps.images.payload.response.ImageResponse;
import com.kamps.users.models.Users;
import com.kamps.users.payload.request.UsersRequest;
import com.kamps.users.payload.response.UsersResponse;
import com.kamps.users.repository.UsersRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private ModelMapper modelMapper;

   // @Override
    //public List<Users> getAllUsers() {
  /*  @Override
    public List<UsersResponse> getAllUsers() {
        ModelMapper modelMapper= new ModelMapper();
        List<Users> list_users=usersRepository.findAll();
        List<UsersResponse> list_res =new ArrayList<>();
        modelMapper.map(modelMapper,list_res);
        return list_res;
    }*/
   // }
   @Override
   public List<UsersResponse> getAllUsers() {
       ModelMapper modelMapper = new ModelMapper();
       List<Users> list_users = usersRepository.findAll();
       List<UsersResponse> list_res = list_users.stream()
               .map(user -> modelMapper.map(user, UsersResponse.class))
               .collect(Collectors.toList());
       return list_res;
   }


    //@Override
   // public Users
   // public Users createUser(Users user) {
    //   return usersRepository.save(user);
  //  }


    @Override
    public Users createUser(UsersRequest usersRequest) {
        Users user = modelMapper.map(usersRequest, Users.class);
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

