package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientDao {
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
}