package com.kamps.professionalDetails.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="professionalDetails")
public class ProfessionalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name="job/business")
    private String jb;
    @Column(name="designation")
    private String designation;
    @Column(name="company_name")
    private String  companyName;
    @Column(name="House No./name/ plot no")
    private String hno;
    @Column(name="street/landmark")
    private String sl;
    @Column(name="village")
    private String village;
    @Column(name="mandal/area")
    private String ma;
    @Column(name="district")
    private String district;
    @Column(name="state")
    private String state;
}
