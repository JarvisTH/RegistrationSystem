package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.PatientLoginLog;

import java.util.List;

public interface PatientLoginLogService {

    int addPatientLoginLog(PatientLoginLog patientLoginLog);

    int deletePatientLoginLog(int id);

    int updatePatientLoginLog(PatientLoginLog patientLoginLog);

    List<PatientLoginLog> getPatientLoginLogs();
}
