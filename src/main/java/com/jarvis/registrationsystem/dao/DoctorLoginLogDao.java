package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.DoctorLoginLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoctorLoginLogDao {
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
