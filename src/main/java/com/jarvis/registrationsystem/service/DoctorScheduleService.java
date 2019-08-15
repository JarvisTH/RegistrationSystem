package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.DoctorSchedule;

import java.util.List;

public interface DoctorScheduleService {

    int addDoctorSchedule(DoctorSchedule doctorSchedule);

    int deleteDoctorSchedule(int id);

    int updateDoctorSchedule(DoctorSchedule doctorSchedule);

    List<DoctorSchedule> getDoctorSchedules();
}
