package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.DoctorLoginLog;

import java.util.List;

public interface DoctorLoginLogService {

    int addDoctorLoginLog(DoctorLoginLog doctorLoginLog);

    int deleteDoctorLoginLog(int id);

    int updateDoctorLoginLog(DoctorLoginLog doctorLoginLog);

    List<DoctorLoginLog> getDoctorLoginLogs();

    List<DoctorLoginLog> getDoctorLoginLogList(int id,int doctorId);
}
