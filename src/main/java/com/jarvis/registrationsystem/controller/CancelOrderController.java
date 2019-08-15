package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.CancelOrder;
import com.jarvis.registrationsystem.service.CancelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

//定义控制器
@Controller
//定义类请求路径
@RequestMapping("")
public class CancelOrderController {

    @Autowired
    private CancelOrderService cancelOrderService=null;

    @RequestMapping("listCancelOrder")
    public String listCancelOrder(Model model){
        List<CancelOrder> co=cancelOrderService.getCancelOrders();
        model.addAttribute("co",co);
        return "admin/listCancelOrder";
    }

    @RequestMapping("deleteCancelOrder")
    public String deleteCancelOrder(Model model){
        //传来id号
        cancelOrderService.deleteCancelOrder(id);
        return "admin/listCancelOrder";
    }

    @RequestMapping("updateCancelOrder")
    public String updateCancelOrder(Model model){
        //传来id，name..或者CancelOrder实例
        CancelOrder cancelOrder=new CancelOrder();
        cancelOrderService.updateCancelOrder(cancelOrder);
        return "admin/listCancelOrder";
    }

    @RequestMapping("addCancelOrder")
    public String addCancelOrder(Model model){
        //传来name...或者实例
        CancelOrder cancelOrder=new CancelOrder();
        cancelOrderService.addCancelOrder(cancelOrder);
        return "admin/listCancelOrder";
    }

}
