package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.DoctorScheduleMapper;
import com.jarvis.registrationsystem.pojo.DoctorSchedule;
import com.jarvis.registrationsystem.service.DoctorScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class DoctorScheduleServiceImpl implements DoctorScheduleService {
    @Autowired
    private DoctorScheduleMapper doctorScheduleMapper=null;

    @Override
    public int addDoctorSchedule(DoctorSchedule doctorSchedule){
        return doctorScheduleMapper.addDoctorSchedule(doctorSchedule);
    }

    @Override
    public int deleteDoctorSchedule(int id){
        return doctorScheduleMapper.deleteDoctorSchedule(id);
    }

    @Override
    public int updateDoctorSchedule(DoctorSchedule doctorSchedule){
        return doctorScheduleMapper.updateDoctorSchedule(doctorSchedule);
    }

    @Override
    public List<DoctorSchedule> getDoctorSchedules(){
        return doctorScheduleMapper.getDoctorSchedules();
    }

    @Override
    public List<DoctorSchedule> getDoctorScheduleList(int id,int doctorId){
        return doctorScheduleMapper.getDoctorScheduleList(id,doctorId);
    }

}
