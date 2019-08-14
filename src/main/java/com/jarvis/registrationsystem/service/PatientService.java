package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.Patient;

import java.util.List;

public interface PatientService {
    /**
     * 添加
     * @param patient
     * @return
     */
    int addPatient(Patient patient);

    /**
     * 删除
     * @param patient
     * @return
     */
    int deletePatient(Patient patient);

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
