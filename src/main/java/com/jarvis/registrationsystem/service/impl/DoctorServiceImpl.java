package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.DoctorMapper;
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
    private DoctorMapper doctorMapper=null;

    @Override
    public int addDoctor(Doctor doctor){
        return doctorMapper.addDoctor(doctor);
    }

    @Override
    public int deleteDoctor(int id){
        return doctorMapper.deleteDoctor(id);
    }

    @Override
    public int updateDoctor(Doctor doctor){
        return doctorMapper.updateDoctor(doctor);
    }

    @Override
    public List<Doctor> getDoctors(){
        return doctorMapper.getDoctors();
    }

    @Override
    public List<Doctor> getDoctorList(int id,String name,String sex){
        return doctorMapper.getDoctorList(id,name,sex);
    }
}
