package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.DoctorLoginLogMapper;
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
    private DoctorLoginLogMapper doctorLoginLogMapper=null;

    @Override
    public int addDoctorLoginLog(DoctorLoginLog doctorLoginLog){
        return doctorLoginLogMapper.addDoctorLoginLog(doctorLoginLog);
    }

    @Override
    public int deleteDoctorLoginLog(int id){
        return doctorLoginLogMapper.deleteDoctorLoginLog(id);
    }

    @Override
    public int updateDoctorLoginLog(DoctorLoginLog doctorLoginLog){
        return doctorLoginLogMapper.updateDoctorLoginLog(doctorLoginLog);
    }

    @Override
    public List<DoctorLoginLog> getDoctorLoginLogs(){
        return doctorLoginLogMapper.getDoctorLoginLogs();
    }

    @Override
    public List<DoctorLoginLog> getDoctorLoginLogList(int id,int doctorId){
        return doctorLoginLogMapper.getDoctorLoginLogList(id,doctorId);
    }
}
