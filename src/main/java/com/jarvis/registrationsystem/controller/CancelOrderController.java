package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.CancelOrder;
import com.jarvis.registrationsystem.service.CancelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//定义控制器
@Controller
//定义类请求路径
@RequestMapping()
public class CancelOrderController {

    @Autowired
    private CancelOrderService cancelOrderService=null;

    @RequestMapping("welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("listCancelOrder")
    public String listCancelOrder(Model model){
        List<CancelOrder> cancelOrders=cancelOrderService.getCancelOrders();
        model.addAttribute("cancelOrders",cancelOrders);
        return "admin/list/listCancelOrder";
    }

    @RequestMapping("deleteCancelOrder")
    public String deleteCancelOrder(int id){
        cancelOrderService.deleteCancelOrder(id);
        return "redirect:admin/list/listCancelOrder";
    }

    @RequestMapping("updateCancelOrder")
    public String updateCancelOrder(int id,String serialNumber,int patientId,int doctorId,int scheduleId,String keMu,String keShi,String price){
        CancelOrder cancelOrder=new CancelOrder();
        cancelOrder.setId(id);
        cancelOrder.setSerialNumber(serialNumber);
        cancelOrder.setPatientId(patientId);
        cancelOrder.setDoctorId(doctorId);
        cancelOrder.setScheduleId(scheduleId);
        cancelOrder.setKeMu(keMu);
        cancelOrder.setKeShi(keShi);
        cancelOrder.setPrice(price);
        cancelOrderService.updateCancelOrder(cancelOrder);
        return "redirect:admin/list/listCancelOrder";
    }

    @RequestMapping("addCancelOrder")
    public String addCancelOrder(String serialNumber,int patientId,int doctorId,int scheduleId,String keMu,String keShi){
        CancelOrder cancelOrder=new CancelOrder();
        cancelOrder.setSerialNumber(serialNumber);
        cancelOrder.setPatientId(patientId);
        cancelOrder.setDoctorId(doctorId);
        cancelOrder.setScheduleId(scheduleId);
        cancelOrder.setKeMu(keMu);
        cancelOrder.setKeShi(keShi);
        //根据doctorId查职称，然后查到价格
        cancelOrderService.addCancelOrder(cancelOrder);
        return "redirect:admin/list/listCancelOrder";
    }

    @RequestMapping("getCancelOrderListByPara")
    public String getCancelOrderListByPara(int scheduleId, String keMu, String keShi, Model model){
        List<CancelOrder> cancelOrders=cancelOrderService.getCancelOrderList(scheduleId,keMu,keShi);
        model.addAttribute("cancelOrders",cancelOrders);
        return "admin/list/listCancelOrder";
    }

}
