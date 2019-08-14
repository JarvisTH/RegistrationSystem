package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.pojo.DoctorSchedule;
import com.jarvis.registrationsystem.service.DoctorScheduleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DoctorScheduleServiceImpl implements DoctorScheduleService {
    @Autowired
    private DoctorScheduleService doctorScheduleService;

    @Override
    public int addDoctorSchedule(DoctorSchedule doctorSchedule){
        return doctorScheduleService.addDoctorSchedule(doctorSchedule);
    }

    @Override
    public int deleteDoctorSchedule(DoctorSchedule doctorSchedule){
        return doctorScheduleService.deleteDoctorSchedule(doctorSchedule);
    }

    @Override
    public int updateDoctorSchedule(DoctorSchedule doctorSchedule){
        return doctorScheduleService.updateDoctorSchedule(doctorSchedule);
    }

    @Override
    public List<DoctorSchedule> getDoctorSchedules(){
        return doctorScheduleService.getDoctorSchedules();
    }

}
