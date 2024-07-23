package com.kamps.permanentAddress.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="permanent_address")
public class PermanentAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name="House No./name/ plot no")
    private String hno;
@Column(name="street/landmark")
    private String sl;
@Column(name="village")
    private String  village;
@Column(name="mandal/area")
    private String ma;
@Column(name="district")
    private String district;
@Column(name="state")
    private String state;
@Column(name="phone no")
private String phone;

}
