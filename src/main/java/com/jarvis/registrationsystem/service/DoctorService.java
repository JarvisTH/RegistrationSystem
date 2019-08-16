package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.Doctor;

import java.util.List;

public interface DoctorService {

    int addDoctor(Doctor doctor);

    int deleteDoctor(int  id);

    int updateDoctor(Doctor doctor);

    List<Doctor> getDoctors();

    List<Doctor> getDoctorList(int id,String name,String sex);
}
