package com.wecp.progressive.service.impl;
<<<<<<< HEAD
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.wecp.progressive.entity.Clinic;
import com.wecp.progressive.repository.ClinicRepository;
import com.wecp.progressive.service.ClinicService;
 
@Service
public class ClinicServiceImplJpa implements ClinicService {
   
    private ClinicRepository clinicRepository;
   
    public ClinicServiceImplJpa(ClinicRepository clinicRepository){
        this.clinicRepository = clinicRepository;
    }
 
    @Override
    public Integer addClinic(Clinic clinic) throws Exception {
        try {
            Clinic savedClinic = clinicRepository.save(clinic);
            return savedClinic.getClinicId();
        } catch (Exception e) {
            throw new Exception("Error adding clinic: " + e.getMessage());
        }
    }
 
    @Override
    public void deleteClinic(int clinicId) throws Exception {
        try {
            if (!clinicRepository.existsById(clinicId)) {
                throw new Exception("Clinic not found with id: " + clinicId);
            }
            clinicRepository.deleteById(clinicId);
        } catch (Exception e) {
            throw new Exception("Error deleting clinic: " + e.getMessage());
        }
    }
 
    @Override
    public List<Clinic> getAllClinicByDoctorId(int doctorId) throws Exception {
        try {
            return clinicRepository.findAllByDoctorId(doctorId);
        } catch (Exception e) {
            throw new Exception("Error fetching clinics by doctor ID: " + e.getMessage());
        }
    }
 
    @Override
    public List<Clinic> getAllClinicByLocation(String location) throws Exception {
        try {
            return clinicRepository.findAllByLocation(location);
        } catch (Exception e) {
            throw new Exception("Error fetching clinics by location: " + e.getMessage());
        }
    }
 
    @Override
    public List<Clinic> getAllClinics() throws Exception {
        try {
            return clinicRepository.findAll();
        } catch (Exception e) {
            throw new Exception("Error fetching all clinics: " + e.getMessage());
        }
    }
 
    @Override
    public Clinic getClinicById(int clinicId) throws Exception {
        try {
            return clinicRepository.findByClinicId(clinicId);
        } catch (Exception e) {
            throw new Exception("Error fetching clinic by ID: " + e.getMessage());
        }
    }
 
    @Override
    public void updateClinic(Clinic clinic) throws Exception {
        try {
            Clinic existingClinic = clinicRepository.findByClinicId(clinic.getClinicId());
            if (existingClinic == null) {
                throw new Exception("Clinic not found with id: " + clinic.getClinicId());
            }
           
            existingClinic.setClinicName(clinic.getClinicName());
            existingClinic.setLocation(clinic.getLocation());
            existingClinic.setContactNumber(clinic.getContactNumber());
            existingClinic.setDoctorId(clinic.getDoctorId());
            existingClinic.setEstablishedYear(clinic.getEstablishedYear());
           
            clinicRepository.save(existingClinic);
        } catch (Exception e) {
            throw new Exception("Error updating clinic: " + e.getMessage());
        }
    }
=======

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Clinic;
import com.wecp.progressive.repository.ClinicRepository;
import com.wecp.progressive.service.ClinicService;

@Service
public class ClinicServiceImplJpa implements ClinicService {
    // @Autowired
    private ClinicRepository clinicRepository;
    public ClinicServiceImplJpa(ClinicRepository clinicRepository){
        this.clinicRepository = clinicRepository;
    }

    @Override
    public Integer addClinic(Clinic clinic) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteClinic(int clinicId) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Clinic> getAllClinicByDoctorId(int doctorId) throws Exception {
        // TODO Auto-generated method stub
        return ClinicService.super.getAllClinicByDoctorId(doctorId);
    }

    @Override
    public List<Clinic> getAllClinicByLocation(String location) throws Exception {
        // TODO Auto-generated method stub
        return ClinicService.super.getAllClinicByLocation(location);
    }

    @Override
    public List<Clinic> getAllClinics() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Clinic getClinicById(int clinicId) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateClinic(Clinic clinic) throws Exception {
        // TODO Auto-generated method stub
        
    }

    
>>>>>>> 3d55de21b5de404dd0b4ec65a2bb6a758571835d
}