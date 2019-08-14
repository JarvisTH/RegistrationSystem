package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.DoctorSchedule;

import java.util.List;

public interface DoctorScheduleService {
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
