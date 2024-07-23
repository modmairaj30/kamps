package com.kamps.permanentAddress.payload.request;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PermanentAddressRequest {
    private Integer userId;
    private String hno;
    private String sl;
    private String  village;
    private String ma;
    private String district;
    private String state;
    private String phone;
}
