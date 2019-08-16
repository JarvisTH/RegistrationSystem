package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.RefundRecord;
import com.jarvis.registrationsystem.service.RefundRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class RefundRecordController {

    @Autowired
    private RefundRecordService refundRecordService;

    @RequestMapping("listRefundRecord")
    public String listRefundRecord(Model model){
        List<RefundRecord>  refundRecords=refundRecordService.getRefundRecords();
        model.addAttribute("refundRecords",refundRecords);
        return "admin/listRefundRecord";
    }

    @RequestMapping("updateRefundRecord")
    public String updateRefundRecord(Model model){
        //传来参数或者实例
        RefundRecord refundRecord=new RefundRecord();
        refundRecordService.updateRefundRecord(refundRecord);
        return "admin/listRefundRecord";
    }

    @RequestMapping("deleteRefundRecord")
    public String deleteRefundRecord(Model model){
        //传来id
        refundRecordService.deleteRefundRecord(id);
        return "admin/listRefundRecord";
    }

    @RequestMapping("addRefundRecord")
    public String addRefundRecord(Model model){
        //传来参数或者实例
        RefundRecord refundRecord=new RefundRecord();
        refundRecordService.addRefundRecord(refundRecord);
        return "admin/listRefundRecord";
    }

    @RequestMapping("getRefundRecordListByPara")
    public String getRefundRecordListByPara(Model model){
        //传来参数
        List<RefundRecord> refundRecords=refundRecordService.getRefundRecordList(cancelOrderId);
        model.addAttribute("refundRecords",refundRecords);
        return "admin/listRefundRecord";
    }
}
