package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.OrderRecord;
import com.jarvis.registrationsystem.service.OrderRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class OrderRecordContrller {

    @Autowired
    private OrderRecordService orderRecordService;

    @RequestMapping("listOrderRecord")
    public String listOrderRecord(Model model){
        List<OrderRecord> orderRecords=orderRecordService.getOrderRecords();
        model.addAttribute("orderRecords",orderRecords);
        return "admin/list/listOrderRecord";
    }


    @RequestMapping("updateOrderRecord")
    public String updateOrderRecord(int id,String serialNumber,int patientId,int doctorId,int scheduleId,
                                    String keMu,String keShi,String price){
        OrderRecord orderRecord=new OrderRecord();
        orderRecord.setId(id);
        orderRecord.setSerialNumber(serialNumber);
        orderRecord.setPatientId(patientId);
        orderRecord.setDoctorId(doctorId);
        orderRecord.setScheduleId(scheduleId);
        orderRecord.setKeMu(keMu);
        orderRecord.setKeShi(keShi);
        orderRecord.setPrice(price);
        orderRecordService.updateOrderRecord(orderRecord);
        return "redirect:admin/list/listOrderRecord";
    }

    @RequestMapping("deleteOrderRecord")
    public String deleteOrderRecord(int id){
        orderRecordService.deleteOrderRecord(id);
        return "redirect:admin/list/listOrderRecord";
    }

    @RequestMapping("addOrderRecord")
    public String addOrderRecord(String serialNumber,int patientId,int doctorId,int scheduleId,
                                 String keMu,String keShi,String price){
        OrderRecord orderRecord=new OrderRecord();
        orderRecord.setSerialNumber(serialNumber);
        orderRecord.setPatientId(patientId);
        orderRecord.setDoctorId(doctorId);
        orderRecord.setScheduleId(scheduleId);
        orderRecord.setKeMu(keMu);
        orderRecord.setKeShi(keShi);
        orderRecord.setPrice(price);
        orderRecordService.addOrderRecord(orderRecord);
        return "redirect:admin/list/listOrderRecord";
    }

    @RequestMapping("getOrderRecordListByPara")
    public String getOrderRecordListByPara(int scheduleId, String keMu, String keShi, Model model){
        List<OrderRecord> orderRecords=orderRecordService.getOrderRecordList(scheduleId,keMu,keShi);
        model.addAttribute("orderRecords",orderRecords);
        return "redirect:admin/list/listOrderRecord";
    }
}
