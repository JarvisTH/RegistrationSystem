package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.Doctor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorMapper {
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

    /**
     * 根据参数获取列表
     * @param id
     * @param name
     * @param sex
     * @return
     */
    List<Doctor> getDoctorList(@Param("id")int id,@Param("name") String name,@Param("sex") String sex);
}
