package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.DoctorScheduleDao;
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
    private DoctorScheduleDao doctorScheduleDao=null;

    @Override
    public int addDoctorSchedule(DoctorSchedule doctorSchedule){
        return doctorScheduleDao.addDoctorSchedule(doctorSchedule);
    }

    @Override
    public int deleteDoctorSchedule(int id){
        return doctorScheduleDao.deleteDoctorSchedule(id);
    }

    @Override
    public int updateDoctorSchedule(DoctorSchedule doctorSchedule){
        return doctorScheduleDao.updateDoctorSchedule(doctorSchedule);
    }

    @Override
    public List<DoctorSchedule> getDoctorSchedules(){
        return doctorScheduleDao.getDoctorSchedules();
    }

}
