package com.kamps.presentAddress.controllers;

import com.kamps.constant.CommonConstant;
import com.kamps.constant.ResponseWrapper;
import com.kamps.permanentAddress.payload.request.PermanentAddressRequest;
import com.kamps.permanentAddress.payload.response.PermanentAddressResponse;
import com.kamps.presentAddress.payload.request.PresentAddressRequest;
import com.kamps.presentAddress.payload.response.PresentAddressResponse;
import com.kamps.presentAddress.services.PresentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class PresentAddressController {
    @Autowired
    PresentAddressService  presentAddressService;
    @GetMapping("/getAllAddresses")
    public ResponseWrapper<List<PresentAddressResponse>> getAllAddresses(){
        List<PresentAddressResponse> addressList=presentAddressService.getAllAddresses();
        return new ResponseWrapper(HttpStatus.OK,"",addressList);
    }


    @PostMapping("/create")
    public ResponseEntity<String> createPresentAddress(@RequestBody PresentAddressRequest presentAddressRequest) {
        presentAddressService.createPresentAddress(presentAddressRequest);
        return ResponseEntity.ok(CommonConstant.PRESENTADDRESS_SUCCESSFULLY);
    }
}
