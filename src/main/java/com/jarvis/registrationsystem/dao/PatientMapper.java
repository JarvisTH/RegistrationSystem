package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientMapper {
    /**
     * 添加
     * @param patient
     * @return
     */
    int addPatient(Patient patient);

    /**
     * 删除
     * @param id
     * @return
     */
    int deletePatient(int id);

    /**
     * 更新
     * @param patient
     * @return
     */
    int updatePatient(Patient patient);

    /**
     * 获取列表
     * @return
     */
    List<Patient> getPatients();

    /**
     * 根据参数获取列表
     * @param id
     * @param name
     * @param sex
     * @return
     */
    List<Patient> getPatientList(@Param("id") int id,@Param("name")  String name,@Param("sex")  String sex);
}
