package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.Doctor;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface DoctorDao {
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
