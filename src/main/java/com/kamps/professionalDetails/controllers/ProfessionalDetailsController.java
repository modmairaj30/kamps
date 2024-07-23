package com.kamps.professionalDetails.controllers;

import com.kamps.constant.CommonConstant;
import com.kamps.constant.ResponseWrapper;

import com.kamps.professionalDetails.payload.request.ProfessionalDetailsRequest;
import com.kamps.professionalDetails.payload.response.ProfessionalDetailsResponse;
import com.kamps.professionalDetails.services.ProfessionalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/details")
public class ProfessionalDetailsController {
    @Autowired
    ProfessionalDetailsService  professionalDetailsService;
    @GetMapping("/getAllDetails")
    public ResponseWrapper<List<ProfessionalDetailsResponse>> getAllDetails(){
        List<ProfessionalDetailsResponse> detailsList=professionalDetailsService.getAllDetails();
        return new ResponseWrapper(HttpStatus.OK,"",detailsList);
    }


    @PostMapping("/create")
    public ResponseEntity<String> createDetails(@RequestBody ProfessionalDetailsRequest professionalDetailsRequest) {
        professionalDetailsService.createDetails(professionalDetailsRequest);
        return ResponseEntity.ok(CommonConstant.DETAILS_SUCCESSFULLY);
    }
}
