package com.kamps.permanentAddress.payload.response;

import lombok.Data;

@Data
public class PermanentAddressResponse {
    private Integer userId;
    private String hno;
    private String sl;
    private String  village;
    private String ma;
    private String district;
    private String state;
    private String phone;
}
