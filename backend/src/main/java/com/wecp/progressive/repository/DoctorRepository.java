package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Doctor;
import java.util.List;


public interface DoctorRepository extends JpaRepository<Doctor,Integer>
{
    // List<Doctor> findByDoctorId(int doctorId);
    Doctor findByDoctorId(Integer doctorId);
<<<<<<< HEAD
    Doctor findByEmail(String email);
=======
>>>>>>> b7e5e459680b0677906f6463d29e0cfa34b74fbc
}