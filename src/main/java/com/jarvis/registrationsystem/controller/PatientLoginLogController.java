package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.PatientLoginLog;
import com.jarvis.registrationsystem.service.PatientLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PatientLoginLogController {

    @Autowired
    private PatientLoginLogService patientLoginLogService;

    @RequestMapping("listPatientLoginLog")
    public String listPatientLoginLog(Model model){
        List<PatientLoginLog> patientLoginLogs=patientLoginLogService.getPatientLoginLogs();
        model.addAttribute("patientLoginLogs",patientLoginLogs);
        return "admin/listPatientLoginLog";
    }


    @RequestMapping("updatePatientLoginLog")
    public String updatePatientLoginLog(Model model){
        //传来参数或者实例
        PatientLoginLog patientLoginLog=new PatientLoginLog();
        patientLoginLogService.updatePatientLoginLog(patientLoginLog);
        return "admin/listPatientLoginLog";
    }

    @RequestMapping("deletePatientLoginLog")
    public String deletePatientLoginLog(Model model){
        //传来id
        patientLoginLogService.deletePatientLoginLog(id);
        return "admin/listPatientLoginLog";
    }

    @RequestMapping("addPatientLoginLog")
    public String addPatientLoginLog(Model model){
        //传来参数或者实例
        PatientLoginLog patientLoginLog=new PatientLoginLog();
        patientLoginLogService.addPatientLoginLog(patientLoginLog);
        return "admin/listPatientLoginLog";
    }
}
