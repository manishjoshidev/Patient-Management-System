package com.pm.patient_service.repository;

import com.pm.patient_service.model.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {

    boolean existsByEmail(String email); // if email is already exist
    boolean existsByEmailAndIdNot(String email,UUID id);

}
