package com.jarvis.registrationsystem.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value="cancel_order")
public class CancelOrder {
    private int id;
    private String serialNumber;
    private int patientId;
    private int doctorId;
    private int scheduleId;
    private String keMu;
    private String keShi;
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getKeMu() {
        return keMu;
    }

    public void setKeMu(String keMu) {
        this.keMu = keMu;
    }

    public String getKeShi() {
        return keShi;
    }

    public void setKeShi(String keShi) {
        this.keShi = keShi;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
