package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.PatientLoginLogMapper;
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
    private PatientLoginLogMapper patientLoginLogMapper=null;

    @Override
    public int addPatientLoginLog(PatientLoginLog patientLoginLog){
        return patientLoginLogMapper.addPatientLoginLog(patientLoginLog);
    }

    @Override
    public int deletePatientLoginLog(int id){
        return patientLoginLogMapper.deletePatientLoginLog(id);
    }

    @Override
    public int updatePatientLoginLog(PatientLoginLog patientLoginLog){
        return patientLoginLogMapper.updatePatientLoginLog(patientLoginLog);
    }

    @Override
    public List<PatientLoginLog> getPatientLoginLogs(){
        return patientLoginLogMapper.getPatientLoginLogs();
    }

    @Override
    public List<PatientLoginLog> getPatientLoginLogList(int id,int patientId){
        return patientLoginLogMapper.getPatientLoginLogList(id,patientId);
    }
}
