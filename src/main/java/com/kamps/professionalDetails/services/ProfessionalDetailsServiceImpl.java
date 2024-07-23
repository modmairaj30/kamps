package com.kamps.professionalDetails.services;

import com.kamps.presentAddress.models.PresentAddress;
import com.kamps.presentAddress.payload.response.PresentAddressResponse;
import com.kamps.professionalDetails.models.ProfessionalDetails;
import com.kamps.professionalDetails.payload.request.ProfessionalDetailsRequest;
import com.kamps.professionalDetails.payload.response.ProfessionalDetailsResponse;
import com.kamps.professionalDetails.repository.ProfessionalDetailsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service

public class ProfessionalDetailsServiceImpl implements ProfessionalDetailsService{
    @Autowired
    ProfessionalDetailsRepository professionalDetailsRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<ProfessionalDetailsResponse> getAllDetails() {
        ModelMapper modelMapper = new ModelMapper();
        List<ProfessionalDetails> list_details = professionalDetailsRepository.findAll();
        List<ProfessionalDetailsResponse> list_res = list_details.stream()
                .map(professionalDetails -> modelMapper.map(professionalDetails,ProfessionalDetailsResponse.class))
                .collect(Collectors.toList());
        return list_res;

    }

    @Override
    public ProfessionalDetails createDetails(ProfessionalDetailsRequest professionalDetailsRequest) {
        ProfessionalDetails details = modelMapper.map(professionalDetailsRequest, ProfessionalDetails.class);
        return professionalDetailsRepository.save(details);
    }
}
