package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.Doctor;
import com.jarvis.registrationsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping("listDoctor")
    public String listDoctor(List<Doctor> doctors,Model model){
        if(doctors==null){
            doctors=doctorService.getDoctors();
        }
        model.addAttribute("doctors",doctors);
        return "admin/listDoctor";
    }

    @RequestMapping("updateDoctor")
    public String updateDoctor(int id,String name,String sex,String age,String title,String keMu,String keShi,
                               String expertise,String introduction){
        Doctor doctor=new Doctor();
        doctor.setId(id);
        doctor.setName(name);
        doctor.setSex(sex);
        doctor.setAge(age);
        doctor.setTitle(title);
        doctor.setKeMu(keMu);
        doctor.setKeShi(keShi);
        doctor.setExpertise(expertise);
        doctor.setIntroduction(introduction);
        doctorService.updateDoctor(doctor);
        return "redirect:admin/listDoctor";
    }

    @RequestMapping("deleteDoctor")
    public String deleteDoctor(int id){
        doctorService.deleteDoctor(id);
        return "redirect:admin/listDoctor";
    }

    @RequestMapping("addDoctor")
    public String addDoctor(String name,String sex,String age,String title,String keMu,String keShi,
                            String expertise,String introduction){
        //传来参数或者实例
        Doctor doctor=new Doctor();
        doctor.setName(name);
        doctor.setSex(sex);
        doctor.setAge(age);
        doctor.setTitle(title);
        doctor.setKeMu(keMu);
        doctor.setKeShi(keShi);
        doctor.setExpertise(expertise);
        doctor.setIntroduction(introduction);
        doctorService.addDoctor(doctor);
        return "redirect:admin/listDoctor";
    }

    @RequestMapping("getDoctorListByPara")
    public String getDoctorListByPara(int id, String name, String sex, RedirectAttributes ra){
        List<Doctor> doctors=doctorService.getDoctorList(id,name,sex);
        ra.addAttribute("doctors",doctors);
        return "redirect:admin/listDoctor";
    }
}
