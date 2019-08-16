package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.DoctorLoginLogDao;
import com.jarvis.registrationsystem.pojo.DoctorLoginLog;
import com.jarvis.registrationsystem.service.DoctorLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class DoctorLoginLogServiceImpl implements DoctorLoginLogService {

    @Autowired
    private DoctorLoginLogDao doctorLoginLogDao=null;

    @Override
    public int addDoctorLoginLog(DoctorLoginLog doctorLoginLog){
        return doctorLoginLogDao.addDoctorLoginLog(doctorLoginLog);
    }

    @Override
    public int deleteDoctorLoginLog(int id){
        return doctorLoginLogDao.deleteDoctorLoginLog(id);
    }

    @Override
    public int updateDoctorLoginLog(DoctorLoginLog doctorLoginLog){
        return doctorLoginLogDao.updateDoctorLoginLog(doctorLoginLog);
    }

    @Override
    public List<DoctorLoginLog> getDoctorLoginLogs(){
        return doctorLoginLogDao.getDoctorLoginLogs();
    }

    @Override
    public List<DoctorLoginLog> getDoctorLoginLogList(int id,int doctorId){
        return doctorLoginLogDao.getDoctorLoginLogList(id,doctorId);
    }
}
