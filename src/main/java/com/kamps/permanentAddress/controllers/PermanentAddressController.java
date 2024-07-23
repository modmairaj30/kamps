package com.kamps.permanentAddress.controllers;


import com.kamps.constant.CommonConstant;
import com.kamps.constant.ResponseWrapper;
import com.kamps.permanentAddress.payload.request.PermanentAddressRequest;
import com.kamps.permanentAddress.payload.response.PermanentAddressResponse;
import com.kamps.permanentAddress.services.PermanentAddressService;
import com.kamps.users.payload.request.UsersRequest;
import com.kamps.users.payload.response.UsersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class PermanentAddressController {
    @Autowired
    private PermanentAddressService  permanentAddressService;
    @GetMapping("/getAllAddress")
    public ResponseWrapper<List<PermanentAddressResponse>> getAllAddress(){
        List<PermanentAddressResponse> addressList=permanentAddressService.getAllAddress();
        return new ResponseWrapper(HttpStatus.OK,"",addressList);
    }


    @PostMapping("/create")
    public ResponseEntity<String> createAddress(@RequestBody PermanentAddressRequest permanentAddressRequest) {
        permanentAddressService.createPermanentAddress(permanentAddressRequest);
        return ResponseEntity.ok(CommonConstant.ADDRESS_SUCCESSFULLY);
    }
}
