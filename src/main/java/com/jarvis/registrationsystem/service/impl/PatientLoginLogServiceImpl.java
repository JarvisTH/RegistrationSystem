package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.PatientLoginLogDao;
import com.jarvis.registrationsystem.pojo.PatientLoginLog;
import com.jarvis.registrationsystem.service.PatientLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PatientLoginLogServiceImpl implements PatientLoginLogService {
    @Autowired
    private PatientLoginLogDao patientLoginLogDao;

    @Override
    public int addPatientLoginLog(PatientLoginLog patientLoginLog){
        return patientLoginLogDao.addPatientLoginLog(patientLoginLog);
    }

    @Override
    public int deletePatientLoginLog(PatientLoginLog patientLoginLog){
        return patientLoginLogDao.deletePatientLoginLog(patientLoginLog);
    }

    @Override
    public int updatePatientLoginLog(PatientLoginLog patientLoginLog){
        return patientLoginLogDao.updatePatientLoginLog(patientLoginLog);
    }

    @Override
    public List<PatientLoginLog> getPatientLoginLogs(){
        return patientLoginLogDao.getPatientLoginLogs();
    }
}
