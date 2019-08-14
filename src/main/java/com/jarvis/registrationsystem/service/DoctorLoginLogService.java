package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.DoctorLoginLog;

import java.util.List;

public interface DoctorLoginLogService {
    /**
     * 添加
     * @param doctorLoginLog
     * @return
     */
    int addDoctorLoginLog(DoctorLoginLog doctorLoginLog);

    /**
     * 删除
     * @param doctorLoginLog
     * @return
     */
    int deleteDoctorLoginLog(DoctorLoginLog doctorLoginLog);

    /**
     * 更新
     * @param doctorLoginLog
     * @return
     */
    int updateDoctorLoginLog(DoctorLoginLog doctorLoginLog);

    /**
     * 获取列表
     * @return
     */
    List<DoctorLoginLog> getDoctorLoginLogs();
}
