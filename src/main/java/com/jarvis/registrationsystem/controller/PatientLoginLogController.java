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
        return "admin/list/listPatientLoginLog";
    }


    @RequestMapping("updatePatientLoginLog")
    public String updatePatientLoginLog(int id,int patientId,String loginTime){
         PatientLoginLog patientLoginLog=new PatientLoginLog();
         patientLoginLog.setId(id);
         patientLoginLog.setPatientId(patientId);
         patientLoginLog.setLoginTime(loginTime);
        patientLoginLogService.updatePatientLoginLog(patientLoginLog);
        return "redirect:admin/list/listPatientLoginLog";
    }

    @RequestMapping("deletePatientLoginLog")
    public String deletePatientLoginLog(int id){
        patientLoginLogService.deletePatientLoginLog(id);
        return "redirect:admin/list/listPatientLoginLog";
    }

    @RequestMapping("addPatientLoginLog")
    public String addPatientLoginLog(int patientId,String loginTime){
        PatientLoginLog patientLoginLog=new PatientLoginLog();
        patientLoginLog.setPatientId(patientId);
        patientLoginLog.setLoginTime(loginTime);
        patientLoginLogService.addPatientLoginLog(patientLoginLog);
        return "redirect:admin/list/listPatientLoginLog";
    }

    @RequestMapping("getPatientLoginLogListByPara")
    public String getPatientLoginLogListByPara(int id, int patientId, Model model){
        List<PatientLoginLog> patientLoginLogs=patientLoginLogService.getPatientLoginLogList(id,patientId);
        model.addAttribute("patientLoginLogs",patientLoginLogs);
        return "admin/list/listPatientLoginLog";
    }
}
