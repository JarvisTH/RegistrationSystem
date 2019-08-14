package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.DoctorSchedule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoctorScheduleDao {
    /**
     * 添加
     * @param doctorSchedule
     * @return
     */
    int addDoctorSchedule(DoctorSchedule doctorSchedule);

    /**
     * 删除
     * @param doctorSchedule
     * @return
     */
    int deleteDoctorSchedule(DoctorSchedule doctorSchedule);

    /**
     * 更新
     * @param doctorSchedule
     * @return
     */
    int updateDoctorSchedule(DoctorSchedule doctorSchedule);

    /**
     * 获取列表
     * @return
     */
    List<DoctorSchedule> getDoctorSchedules();
}
