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
        return "admin/list/listDoctorSchedule";
    }


    @RequestMapping("updateDoctorSchedule")
    public String updateDoctorSchedule(int id,int doctorId,String building,String floor,String region,String room,
                                       String scheduleDate, String detailTime,String totalAmount,String remainAmount){
        DoctorSchedule doctorSchedule=new DoctorSchedule();
        doctorSchedule.setId(id);
        doctorSchedule.setDoctorId(doctorId);
        doctorSchedule.setBuilding(building);
        doctorSchedule.setFloor(floor);
        doctorSchedule.setRegion(region);
        doctorSchedule.setRoom(room);
        doctorSchedule.setScheduleDate(scheduleDate);
        doctorSchedule.setDetailTime(detailTime);
        doctorSchedule.setTotalAmount(totalAmount);
        doctorSchedule.setRemainAmount(remainAmount);
        doctorScheduleService.updateDoctorSchedule(doctorSchedule);
        return "admin/list/listDoctorSchedule";
    }

    @RequestMapping("deleteDoctorSchedule")
    public String deleteDoctorSchedule(int id){
        doctorScheduleService.deleteDoctorSchedule(id);
        return "admin/list/listDoctorSchedule";
    }

    @RequestMapping("addDoctorSchedule")
    public String addDoctorSchedule(int doctorId,String building,String floor,String region,String room,
                                    String scheduleDate, String detailTime,String totalAmount,String remainAmount){
        DoctorSchedule doctorSchedule=new DoctorSchedule();
        doctorSchedule.setDoctorId(doctorId);
        doctorSchedule.setBuilding(building);
        doctorSchedule.setFloor(floor);
        doctorSchedule.setRegion(region);
        doctorSchedule.setRoom(room);
        doctorSchedule.setScheduleDate(scheduleDate);
        doctorSchedule.setDetailTime(detailTime);
        doctorSchedule.setTotalAmount(totalAmount);
        doctorSchedule.setRemainAmount(remainAmount);
        doctorScheduleService.addDoctorSchedule(doctorSchedule);
        return "admin/list/listDoctorSchedule";
    }

    @RequestMapping("getDoctorScheduleListByPara")
    public String getDoctorScheduleListByPara(int id, int doctorId, Model model){
        List<DoctorSchedule> doctorSchedules=doctorScheduleService.getDoctorScheduleList(id,doctorId);
        model.addAttribute("doctorSchedules",doctorSchedules);
        return "admin/list/listDoctorSchedule";
    }
}
