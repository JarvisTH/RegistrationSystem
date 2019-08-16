package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.PatientLoginLogDao;
import com.jarvis.registrationsystem.pojo.PatientLoginLog;
import com.jarvis.registrationsystem.service.PatientLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class PatientLoginLogServiceImpl implements PatientLoginLogService {
    @Autowired
    private PatientLoginLogDao patientLoginLogDao=null;

    @Override
    public int addPatientLoginLog(PatientLoginLog patientLoginLog){
        return patientLoginLogDao.addPatientLoginLog(patientLoginLog);
    }

    @Override
    public int deletePatientLoginLog(int id){
        return patientLoginLogDao.deletePatientLoginLog(id);
    }

    @Override
    public int updatePatientLoginLog(PatientLoginLog patientLoginLog){
        return patientLoginLogDao.updatePatientLoginLog(patientLoginLog);
    }

    @Override
    public List<PatientLoginLog> getPatientLoginLogs(){
        return patientLoginLogDao.getPatientLoginLogs();
    }

    @Override
    public List<PatientLoginLog> getPatientLoginLogList(int id,int patientId){
        return patientLoginLogDao.getPatientLoginLogList(id,patientId);
    }
}
