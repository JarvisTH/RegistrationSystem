package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.PatientMapper;
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
    private PatientMapper patientMapper=null;

    @Override
    public int addPatient(Patient patient){
        return patientMapper.addPatient(patient);
    }

    @Override
    public int deletePatient(int id){
        return patientMapper.deletePatient(id);
    }

    @Override
    public int updatePatient(Patient patient){
        return patientMapper.updatePatient(patient);
    }

    @Override
    public List<Patient> getPatients(){
        return patientMapper.getPatients();
    }

    @Override
    public List<Patient> getPatientList(int id,String name,String sex){
        return patientMapper.getPatientList(id,name,sex);
    }
}
