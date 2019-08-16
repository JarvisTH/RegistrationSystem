package com.jarvis.registrationsystem.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value = "patient_login_log")
public class PatientLoginLog {
    private int id;
    private int patientId;
    private String loginTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}
