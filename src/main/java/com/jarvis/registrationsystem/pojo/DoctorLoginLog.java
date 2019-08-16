package com.jarvis.registrationsystem.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value = "doctor_login_log")
public class DoctorLoginLog {
    private int id;
    private int doctorId;
    private String loginTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}
