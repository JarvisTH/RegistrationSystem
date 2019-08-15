package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorDao {
    /**
     * 添加
     * @param doctor
     * @return
     */
    int addDoctor(Doctor doctor);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteDoctor(int id);

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
