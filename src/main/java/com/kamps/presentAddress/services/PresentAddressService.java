package com.kamps.presentAddress.services;

import com.kamps.permanentAddress.models.PermanentAddress;
import com.kamps.permanentAddress.payload.request.PermanentAddressRequest;
import com.kamps.permanentAddress.payload.response.PermanentAddressResponse;
import com.kamps.presentAddress.models.PresentAddress;
import com.kamps.presentAddress.payload.request.PresentAddressRequest;
import com.kamps.presentAddress.payload.response.PresentAddressResponse;

import java.util.List;

public interface PresentAddressService {
    List<PresentAddressResponse> getAllAddresses();
    PresentAddress createPresentAddress(PresentAddressRequest presentAddressRequest);
}
