package com.kamps.professionalDetails.services;

import com.kamps.presentAddress.models.PresentAddress;
import com.kamps.presentAddress.payload.request.PresentAddressRequest;
import com.kamps.presentAddress.payload.response.PresentAddressResponse;
import com.kamps.professionalDetails.models.ProfessionalDetails;
import com.kamps.professionalDetails.payload.request.ProfessionalDetailsRequest;
import com.kamps.professionalDetails.payload.response.ProfessionalDetailsResponse;

import java.util.List;

public interface ProfessionalDetailsService {
    List<ProfessionalDetailsResponse> getAllDetails();
    ProfessionalDetails createDetails(ProfessionalDetailsRequest professionalDetailsRequest);
}
