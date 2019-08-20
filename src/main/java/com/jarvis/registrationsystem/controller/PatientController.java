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
        return "admin/list/listPatient";
    }

    @RequestMapping("deletePatient")
    public String deletePatient(int id){
        patientService.deletePatient(id);
        return "redirect:admin/list/listPatient";
    }

    @RequestMapping("updatePatient")
    public String updatePatient(int id,String name,String sex,String age,String idCard,String address,String phone){
        Patient patient=new Patient();
        patient.setId(id);
        patient.setName(name);
        patient.setSex(sex);
        patient.setAge(age);
        patient.setIdCard(idCard);
        patient.setAddress(address);
        patient.setPhone(phone);
        patientService.updatePatient(patient);
        return "redirect:admin/list/listPatient";
    }

    @RequestMapping("addPatient")
    public String addPatient(String name,String sex,String age,String idCard,String address,String phone){
        Patient patient=new Patient();
        patient.setName(name);
        patient.setSex(sex);
        patient.setAge(age);
        patient.setIdCard(idCard);
        patient.setAddress(address);
        patient.setPhone(phone);
        patientService.addPatient(patient);
        return "redirect:admin/list/listPatient";
    }

    @RequestMapping("getPatientListByPara")
    public String getPatientListByPara(int id, String name, String sex, Model model){
        List<Patient> patients=patientService.getPatientList(id,name,sex);
        model.addAttribute("patients",patients);
        return "redirect:admin/list/listPatient";
    }
}
