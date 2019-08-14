package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.Doctor;

import java.util.List;

public interface DoctorService {
    /**
     * 添加
     * @param doctor
     * @return
     */
    int addDoctor(Doctor doctor);

    /**
     * 删除
     * @param doctor
     * @return
     */
    int deleteDoctor(Doctor doctor);

    /**
     * 更新
     * @param doctor
     * @return
     */
    int updateDoctor(Doctor doctor);

    /**
     * 获取列表
     * @return
     */
    List<Doctor> getDoctors();
}
