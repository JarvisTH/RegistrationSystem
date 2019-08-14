package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.PatientLoginLog;

import java.util.List;

public interface PatientLoginLogService {
    /**
     * 添加
     * @param patientLoginLog
     * @return
     */
    int addPatientLoginLog(PatientLoginLog patientLoginLog);

    /**
     * 删除
     * @param patientLoginLog
     * @return
     */
    int deletePatientLoginLog(PatientLoginLog patientLoginLog);

    /**
     * 更新
     * @param patientLoginLog
     * @return
     */
    int updatePatientLoginLog(PatientLoginLog patientLoginLog);

    /**
     * 获取列表
     * @return
     */
    List<PatientLoginLog> getPatientLoginLogs();
}
