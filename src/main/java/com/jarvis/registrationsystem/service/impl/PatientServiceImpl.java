package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.PatientDao;
import com.jarvis.registrationsystem.pojo.Patient;
import com.jarvis.registrationsystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;

    @Override
    public int addPatient(Patient patient){
        return patientDao.addPatient(patient);
    }

    @Override
    public int deletePatient(Patient patient){
        return patientDao.deletePatient(patient);
    }

    @Override
    public int updatePatient(Patient patient){
        return patientDao.updatePatient(patient);
    }

    @Override
    public List<Patient> getPatients(){
        return patientDao.getPatients();
    }
}
