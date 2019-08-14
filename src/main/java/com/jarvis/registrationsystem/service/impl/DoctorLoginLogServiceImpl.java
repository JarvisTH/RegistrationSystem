package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.DoctorLoginLogDao;
import com.jarvis.registrationsystem.pojo.DoctorLoginLog;
import com.jarvis.registrationsystem.service.DoctorLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DoctorLoginLogServiceImpl implements DoctorLoginLogService {

    @Autowired
    private DoctorLoginLogDao doctorLoginLogDao;

    @Override
    public int addDoctorLoginLog(DoctorLoginLog doctorLoginLog){
        return doctorLoginLogDao.addDoctorLoginLog(doctorLoginLog);
    }

    @Override
    public int deleteDoctorLoginLog(DoctorLoginLog doctorLoginLog){
        return doctorLoginLogDao.deleteDoctorLoginLog(doctorLoginLog);
    }

    @Override
    public int updateDoctorLoginLog(DoctorLoginLog doctorLoginLog){
        return doctorLoginLogDao.updateDoctorLoginLog(doctorLoginLog);
    }

    @Override
    public List<DoctorLoginLog> getDoctorLoginLogs(){
        return doctorLoginLogDao.getDoctorLoginLogs();
    }
}
