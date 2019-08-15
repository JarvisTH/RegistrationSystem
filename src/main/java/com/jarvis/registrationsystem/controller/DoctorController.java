package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.Doctor;
import com.jarvis.registrationsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping("listDoctor")
    public String listDoctor(Model model){
        List<Doctor> doctors=doctorService.getDoctors();
        model.addAttribute("doctors",doctors);
        return "admin/listDoctor";
    }

    @RequestMapping("updateDoctor")
    public String updateDoctor(Model model){
        //传来参数或者实例
        Doctor doctor=new Doctor();
        doctorService.updateDoctor(doctor);
        return "admin/listDoctor";
    }

    @RequestMapping("deleteDoctor")
    public String deleteDoctor(Model model){
        //传来id
        doctorService.deleteDoctor(id);
        return "admin/listDoctor";
    }

    @RequestMapping("addDoctor")
    public String addDoctor(Model model){
        //传来参数或者实例
        Doctor doctor=new Doctor();
        doctorService.addDoctor(doctor);
        return "admin/listDoctor";
    }
}
