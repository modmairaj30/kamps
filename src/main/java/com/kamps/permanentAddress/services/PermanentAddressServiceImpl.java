package com.kamps.permanentAddress.services;

import com.kamps.permanentAddress.models.PermanentAddress;
import com.kamps.permanentAddress.payload.request.PermanentAddressRequest;
import com.kamps.permanentAddress.payload.response.PermanentAddressResponse;
import com.kamps.permanentAddress.repository.PermanentAddressRepository;
import com.kamps.users.models.Users;
import com.kamps.users.payload.response.UsersResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PermanentAddressServiceImpl implements PermanentAddressService{
    @Autowired
    PermanentAddressRepository permanentAddressRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<PermanentAddressResponse> getAllAddress() {
        ModelMapper modelMapper = new ModelMapper();
        List<PermanentAddress> list_address = permanentAddressRepository.findAll();
        List<PermanentAddressResponse> list_res = list_address.stream()
                .map(permanentAddress -> modelMapper.map(permanentAddress,PermanentAddressResponse.class))
                .collect(Collectors.toList());
        return list_res;

    }

    @Override
    public PermanentAddress createPermanentAddress(PermanentAddressRequest permanentAddressRequest) {
        PermanentAddress address = modelMapper.map(permanentAddressRequest, PermanentAddress.class);
        return permanentAddressRepository.save(address);
    }
}
