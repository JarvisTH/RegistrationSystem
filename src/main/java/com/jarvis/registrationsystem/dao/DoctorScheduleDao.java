package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.DoctorSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorScheduleDao {
    /**
     * 添加
     * @param doctorSchedule
     * @return
     */
    int addDoctorSchedule(DoctorSchedule doctorSchedule);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteDoctorSchedule(int id);

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

    /**
     * 根据参数获取列表
     * @param id
     * @param doctorId
     * @return
     */
    List<DoctorSchedule> getDoctorScheduleList(int id,int doctorId);
}
