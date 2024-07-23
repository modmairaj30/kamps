package com.kamps.presentAddress.repository;

import com.kamps.presentAddress.models.PresentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentAddressRepository extends JpaRepository<PresentAddress,Integer> {
}
