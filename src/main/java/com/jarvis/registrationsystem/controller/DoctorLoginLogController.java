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
        return "admin/listDoctorLoginLog";
    }

    @RequestMapping("updateDoctorLoginLog")
    public String updateDoctorLoginLog(Model model){
        //传来参数或者实例
        DoctorLoginLog doctorLoginLog=new DoctorLoginLog();
        doctorLoginLogService.updateDoctorLoginLog(doctorLoginLog);
        return "admin/listDoctorLoginLog";
    }

    @RequestMapping("deleteDoctorLoginLog")
    public String deleteDoctorLoginLog(Model model){
        //传来id
        doctorLoginLogService.deleteDoctorLoginLog(id);
        return "admin/listDoctorLoginLog";
    }

    @RequestMapping("addDoctorLoginLog")
    public String addDoctorLoginLog(Model model){
        //传来参数或者实例
        DoctorLoginLog doctorLoginLog=new DoctorLoginLog();
        doctorLoginLogService.addDoctorLoginLog(doctorLoginLog);
        return "admin/listDoctorLoginLog";
    }

    @RequestMapping("getDoctorLoginLogListByPara")
    public String getDoctorLoginLogListByPara(Model model){
        //传来参数
        List<DoctorLoginLog> doctorLoginLogs=doctorLoginLogService.getDoctorLoginLogList(id,doctorId);
        model.addAttribute("doctorLoginLogs",doctorLoginLogs);
        return "admin/listDoctorLoginLog";
    }
}
