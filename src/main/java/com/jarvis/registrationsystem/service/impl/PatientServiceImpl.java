package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.PatientDao;
import com.jarvis.registrationsystem.pojo.Patient;
import com.jarvis.registrationsystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao=null;

    @Override
    public int addPatient(Patient patient){
        return patientDao.addPatient(patient);
    }

    @Override
    public int deletePatient(int id){
        return patientDao.deletePatient(id);
    }

    @Override
    public int updatePatient(Patient patient){
        return patientDao.updatePatient(patient);
    }

    @Override
    public List<Patient> getPatients(){
        return patientDao.getPatients();
    }

    @Override
    public List<Patient> getPatientList(int id,String name,String sex){
        return patientDao.getPatientList(id,name,sex);
    }
}
