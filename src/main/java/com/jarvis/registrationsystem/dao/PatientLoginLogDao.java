package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.PatientLoginLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientLoginLogDao {
    /**
     * 添加
     * @param patientLoginLog
     * @return
     */
    int addPatientLoginLog(PatientLoginLog patientLoginLog);

    /**
     * 删除
     * @param id
     * @return
     */
    int deletePatientLoginLog(int id);

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
