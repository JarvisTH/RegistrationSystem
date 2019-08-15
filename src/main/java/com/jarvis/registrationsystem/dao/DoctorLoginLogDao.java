package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.DoctorLoginLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorLoginLogDao {
    /**
     * 添加
     * @param doctorLoginLog
     * @return
     */
    int addDoctorLoginLog(DoctorLoginLog doctorLoginLog);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteDoctorLoginLog(int id);

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
