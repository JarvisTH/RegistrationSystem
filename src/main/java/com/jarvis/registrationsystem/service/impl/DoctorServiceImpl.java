package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.DoctorDao;
import com.jarvis.registrationsystem.pojo.Doctor;
import com.jarvis.registrationsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorDao doctorDao;

    @Override
    public int addDoctor(Doctor doctor){
        return doctorDao.addDoctor(doctor);
    }

    @Override
    public int deleteDoctor(Doctor doctor){
        return doctorDao.deleteDoctor(doctor);
    }

    @Override
    public int updateDoctor(Doctor doctor){
        return doctorDao.updateDoctor(doctor);
    }

    @Override
    public List<Doctor> getDoctors(){
        return doctorDao.getDoctors();
    }
}
