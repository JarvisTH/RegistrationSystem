package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.DoctorLoginLog;
import com.jarvis.registrationsystem.service.DoctorLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class DoctorLoginLogController {
    @Autowired
    private DoctorLoginLogService doctorLoginLogService;

    @RequestMapping("listDoctorLoginLog")
    public String listDoctorLoginLog(Model model ){
        List<DoctorLoginLog> doctorLoginLogs=doctorLoginLogService.getDoctorLoginLogs();
        model.addAttribute("doctorLoginLogs",doctorLoginLogs);
        return "admin/list/listDoctorLoginLog";
    }

    @RequestMapping("updateDoctorLoginLog")
    public String updateDoctorLoginLog( int id,int doctorId,String loginTime){
        DoctorLoginLog doctorLoginLog=new DoctorLoginLog();
        doctorLoginLog.setId(id);
        doctorLoginLog.setDoctorId(doctorId);
        doctorLoginLog.setLoginTime(loginTime);
        doctorLoginLogService.updateDoctorLoginLog(doctorLoginLog);
        return "redirect:admin/list/listDoctorLoginLog";
    }

    @RequestMapping("deleteDoctorLoginLog")
    public String deleteDoctorLoginLog(int id){
        doctorLoginLogService.deleteDoctorLoginLog(id);
        return "redirect:admin/list/listDoctorLoginLog";
    }

    @RequestMapping("addDoctorLoginLog")
    public String addDoctorLoginLog(int doctorId,String loginTime){
        DoctorLoginLog doctorLoginLog=new DoctorLoginLog();
        doctorLoginLog.setDoctorId(doctorId);
        doctorLoginLog.setLoginTime(loginTime);
        doctorLoginLogService.addDoctorLoginLog(doctorLoginLog);
        return "redirect:admin/list/listDoctorLoginLog";
    }

    @RequestMapping("getDoctorLoginLogListByPara")
    public String getDoctorLoginLogListByPara(int id, int doctorId, Model model){
        List<DoctorLoginLog> doctorLoginLogs=doctorLoginLogService.getDoctorLoginLogList(id,doctorId);
        model.addAttribute("doctorLoginLogs",doctorLoginLogs);
        return "admin/list/listDoctorLoginLog";
    }
}
