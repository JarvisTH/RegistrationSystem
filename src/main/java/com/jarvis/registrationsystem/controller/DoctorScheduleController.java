package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.DoctorSchedule;
import com.jarvis.registrationsystem.service.DoctorScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class DoctorScheduleController {
    @Autowired
    private DoctorScheduleService doctorScheduleService;

    @RequestMapping("listDoctorSchedule")
    public String listDoctorSchedule(Model model){
        List<DoctorSchedule> doctorSchedules=doctorScheduleService.getDoctorSchedules();
        model.addAttribute("doctorSchedules",doctorSchedules);
        return "admin/listDoctorSchedule";
    }


    @RequestMapping("updateDoctorSchedule")
    public String updateDoctorSchedule(Model model){
        //传来参数或者实例
        DoctorSchedule doctorSchedule=new DoctorSchedule();
        doctorScheduleService.updateDoctorSchedule(doctorSchedule);
        return "admin/listDoctorSchedule";
    }

    @RequestMapping("deleteDoctorSchedule")
    public String deleteDoctorSchedule(Model model){
        //传来id
        doctorScheduleService.deleteDoctorSchedule(id);
        return "admin/listDoctorSchedule";
    }

    @RequestMapping("addDoctorSchedule")
    public String addDoctorSchedule(Model model){
        //传来参数或者实例
        DoctorSchedule doctorSchedule=new DoctorSchedule();
        doctorScheduleService.addDoctorSchedule(doctorSchedule);
        return "admin/listDoctorSchedule";
    }
}
