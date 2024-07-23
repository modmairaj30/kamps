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

    @Column(name="name")
    private String name;
    @Column(name="surname")
    private  String  surname;
    @Column (name="S/o or D/o")
    private String sd;
    @Column(name="subcast")
    private String subcast;
    @Column(name="gotra(m)")
    private String gotra;
    @Column(name="blood_gp")
    private String bloodGp;
    @Column(name="date_of_birth")
    private String db;
    @Column(name="age")
    private String age;
    @Column(name="gender")
    private String gender;
    @Column(name="assembly_constituency(vote)")
    private String ac;
    @Column(name="ph_no1")
    private String p1;
    @Column(name="ph_no2")
    private String p2;
    @Column(name="w/p_no")
    private String wp;


   /** @Column(nullable = false, unique = true)
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
    */

}
