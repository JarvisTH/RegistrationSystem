package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.DoctorDao;
import com.jarvis.registrationsystem.pojo.Doctor;
import com.jarvis.registrationsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorDao doctorDao=null;

    @Override
    public int addDoctor(Doctor doctor){
        return doctorDao.addDoctor(doctor);
    }

    @Override
    public int deleteDoctor(int id){
        return doctorDao.deleteDoctor(id);
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
