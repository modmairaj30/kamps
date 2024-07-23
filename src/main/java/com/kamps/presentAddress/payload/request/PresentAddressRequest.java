package com.kamps.presentAddress.payload.request;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class PresentAddressRequest {

    private Integer userId;
    private String hno;
    private String sl;
    private String  village;
    private String ma;
    private String district;
    private String state;
    private String phone;
}
