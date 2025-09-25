package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.DoctorDAO;
import com.wecp.progressive.entity.Doctor;
import com.wecp.progressive.service.DoctorService;

public class DoctorServiceImplJdbc implements DoctorService  {

    private DoctorDAO doctorDAO;

    public DoctorServiceImplJdbc(DoctorDAO doctorDAO){
        this.doctorDAO = doctorDAO;
    }

    @Override
    public Integer addDoctor(Doctor doctor) throws SQLException{
        System.out.println("Inside the doctor service-1");
        return doctorDAO.addDoctor(doctor);
        // System.out.println("Inside the doctor service-2");
        // try {
        //     Integer id = doctorDAO.addDoctor(doctor);
        // return id;
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // return -1;
    }

    @Override
    public void deleteDoctor(int doctorId){
        // TODO Auto-generated method stub
        // DoctorService.super.deleteDoctor(doctorId);
        try {
            doctorDAO.deleteDoctor(doctorId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        // DoctorService.super.emptyArrayList();
    }

    @Override
    public List<Doctor> getAllDoctors() {
        List<Doctor> list = new ArrayList<>();
        try {
            list = doctorDAO.getAllDoctors();
        return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Doctor getDoctorById(int doctorId) {
        // TODO Auto-generated method stub
        // return DoctorService.super.getDoctorById(doctorId);
        try {
            Doctor doc = doctorDAO.getDoctorById(doctorId);
        return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Doctor> getDoctorSortedByExperience() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        // TODO Auto-generated method stub
        // DoctorService.super.updateDoctor(doctor);
        try {
            doctorDAO.updateDoctor(doctor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}