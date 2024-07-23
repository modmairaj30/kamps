package com.kamps.professionalDetails.payload.request;


import lombok.Data;

@Data
public class ProfessionalDetailsRequest {
    private Integer userId;
    private String jb;
    private String designation;
    private String  companyName;
    private String hno;
    private String sl;
    private String village;
    private String ma;
    private String district;
    private String state;
}
