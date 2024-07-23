package com.kamps.permanentAddress.services;

import com.kamps.permanentAddress.models.PermanentAddress;
import com.kamps.permanentAddress.payload.request.PermanentAddressRequest;
import com.kamps.permanentAddress.payload.response.PermanentAddressResponse;

import java.util.List;

public interface PermanentAddressService {
    List<PermanentAddressResponse> getAllAddress();
    //User getUserById(Integer id);
    PermanentAddress createPermanentAddress(PermanentAddressRequest permanentAddressRequest);
    //void deleteUser(Integer id);
}
