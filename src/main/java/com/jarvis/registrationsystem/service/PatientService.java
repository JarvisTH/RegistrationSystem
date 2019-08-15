package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.Patient;

import java.util.List;

public interface PatientService {

    int addPatient(Patient patient);

    int deletePatient(int id);

    int updatePatient(Patient patient);

    List<Patient> getPatients();
}
