package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.Patient;
import com.jarvis.registrationsystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @RequestMapping("listPatient")
    public String listPatient(Model model){
        List<Patient> patients=patientService.getPatients();
        model.addAttribute("patients",patients);
        return "admin/listPatient";
    }

    @RequestMapping("deletePatient")
    public String deletePatient(Model model){
        //传来id
        patientService.deletePatient(id);
        return "admin/listPatient";
    }

    @RequestMapping("updatePatient")
    public String updatePatient(Model model){
        //传来参数或者实例
        Patient patient=new Patient();
        patientService.updatePatient(patient);
        return "admin/listPatient";
    }

    @RequestMapping("addPatient")
    public String addPatient(Model model){
        //传来参数或者实例
        Patient patient=new Patient();
        patientService.addPatient(patient);
        return "admin/listPatient";
    }
}
