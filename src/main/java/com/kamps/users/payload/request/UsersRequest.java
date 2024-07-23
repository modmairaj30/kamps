package com.kamps.users.payload.request;

import com.kamps.users.models.Users;
import lombok.Data;

@Data
public class UsersRequest {
    private Integer userId;
   // private String email;
   // private String passwordHash;
   // private String fullName;
   // private Users.UserType userType;
    private String name;

    private  String  surname;

    private String sd;

    private String subcast;

    private String gotra;
    private String bloodGp;

    private String db;

    private String age;

    private String gender;

    private String ac;

    private String p1;

    private String p2;

    private String wp;

}
