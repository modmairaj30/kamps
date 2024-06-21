package com.kamps.users.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false)
    private String fullName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserType userType;

    public enum UserType {
        Parent, CampProvider, Admin
    }
}
