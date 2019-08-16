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
        return "admin/listOrderRecord";
    }


    @RequestMapping("updateOrderRecord")
    public String updateOrderRecord(Model model){
        //传来参数或者实例
        OrderRecord orderRecord=new OrderRecord();
        orderRecordService.updateOrderRecord(orderRecord);
        return "admin/listOrderRecord";
    }

    @RequestMapping("deleteOrderRecord")
    public String deleteOrderRecord(Model model){
        //传来id
        orderRecordService.deleteOrderRecord(id);
        return "admin/listOrderRecord";
    }

    @RequestMapping("addOrderRecord")
    public String addOrderRecord(Model model){
        //传来参数或者实例
        OrderRecord orderRecord=new OrderRecord();
        orderRecordService.addOrderRecord(orderRecord);
        return "admin/listOrderRecord";
    }
}
