package com.kamps.presentAddress.services;

import com.kamps.permanentAddress.models.PermanentAddress;
import com.kamps.permanentAddress.payload.response.PermanentAddressResponse;
import com.kamps.presentAddress.models.PresentAddress;
import com.kamps.presentAddress.payload.request.PresentAddressRequest;
import com.kamps.presentAddress.payload.response.PresentAddressResponse;
import com.kamps.presentAddress.repository.PresentAddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PresentAddressServiceImpl  implements PresentAddressService{
    @Autowired
    PresentAddressRepository presentAddressRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<PresentAddressResponse> getAllAddresses() {
        ModelMapper modelMapper = new ModelMapper();
        List<PresentAddress> list_address = presentAddressRepository.findAll();
        List<PresentAddressResponse> list_res = list_address.stream()
                .map(presentAddress -> modelMapper.map(presentAddress,PresentAddressResponse.class))
                .collect(Collectors.toList());
        return list_res;


    }

    @Override
    public PresentAddress createPresentAddress(PresentAddressRequest presentAddressRequest) {
        PresentAddress address = modelMapper.map(presentAddressRequest, PresentAddress.class);
        return presentAddressRepository.save(address);

    }
}
