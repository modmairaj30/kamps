package com.kamps.users.controllers;


import com.kamps.activities.models.Activity;
import com.kamps.constant.CommonConstant;
import com.kamps.constant.ResponseWrapper;
import com.kamps.images.payload.response.ImageResponse;
import com.kamps.users.models.Users;

import com.kamps.users.payload.request.UsersRequest;
import com.kamps.users.payload.response.UsersResponse;
import com.kamps.users.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

   /* @GetMapping("/getAllUsers")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    */

   @GetMapping("/getAllUsers")
    public ResponseWrapper<List<UsersResponse>> getAllUsers(){
        List<UsersResponse> usersList=usersService.getAllUsers();
        return new ResponseWrapper(HttpStatus.OK,"",usersList);
    }


    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody UsersRequest usersRequest) {
       usersService.createUser(usersRequest);
        return ResponseEntity.ok(CommonConstant.USERS_SUCCESSFULLY);
    }



   /* @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }



    @PutMapping("/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        user.setUserId(id);
        return userService.createOrUpdateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }*/
}
