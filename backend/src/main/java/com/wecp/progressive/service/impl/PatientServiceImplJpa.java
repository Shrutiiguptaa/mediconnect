package com.wecp.progressive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.dto.PatientDTO;
import com.wecp.progressive.entity.Patient;
import com.wecp.progressive.repository.PatientRepository;
import com.wecp.progressive.service.PatientService;

@Service
public class PatientServiceImplJpa implements PatientService {
    // @Autowired
    private PatientRepository patientRepository;

    public PatientServiceImplJpa(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    @Override
    public Integer addPatient(Patient patient) throws Exception {
        Patient p = patientRepository.save(patient);
        return p.getPatientId();
    }

    @Override
    public void deletePatient(int patientId) throws Exception {
        Patient p = patientRepository.findById(patientId).get();
        if(p == null){
            throw new Exception("Patient not found with ID: "+patientId);
        }

        patientRepository.deleteById(patientId);

        // TODO Auto-generated method stub
        // PatientService.super.deletePatient(patientId);
    }

    @Override
    public void emptyArrayList() throws Exception {
        // TODO Auto-generated method stub
        PatientService.super.emptyArrayList();
    }

    @Override
    public List<Patient> getAllPatientSortedByName() throws Exception {
       return patientRepository.getAllPatientSortedByName();
    }

    @Override
    public List<Patient> getAllPatients() throws Exception {
        List<Patient> li = patientRepository.findAll();
        return li;
    }

    @Override
    public Patient getPatientById(int patientId) throws Exception {

        List<Patient> li = patientRepository.findByPatientId(patientId);
        return li.get(0);

        // TODO Auto-generated method stub
        // return PatientService.super.getPatientById(patientId);
    }

    @Override
    public void updatePatient(Patient patient) throws Exception {

        List<Patient> li = patientRepository.findByPatientId(patient.getPatientId());
        Patient p = li.get(0);
        p.setFullName(patient.getFullName());
        p.setEmail(patient.getEmail());
        p.setDateOfBirth(patient.getDateOfBirth());
        p.setContactNumber(patient.getContactNumber());
        p.setAddress(patient.getAddress());

        patientRepository.save(p);

        // TODO Auto-generated method stub
        // PatientService.super.updatePatient(patient);
    }

    // @Override
    // public void modifyPatientDetails(PatientDTO patientDTO) {
    // // TODO Auto-generated method stub
    // PatientService.super.modifyPatientDetails(patientDTO);
    // }

}