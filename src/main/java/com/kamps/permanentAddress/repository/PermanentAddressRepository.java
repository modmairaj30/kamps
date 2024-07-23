package com.kamps.permanentAddress.repository;

import com.kamps.permanentAddress.models.PermanentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermanentAddressRepository extends JpaRepository<PermanentAddress,Integer> {

}
