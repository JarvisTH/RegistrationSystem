package com.jarvis.registrationsystem.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value = "order_record")
public class OrderRecord {
    private int id;
    private String serialNumber;
    private String patientId;
    private String doctorId;
    private String scheduleId;
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

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
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
