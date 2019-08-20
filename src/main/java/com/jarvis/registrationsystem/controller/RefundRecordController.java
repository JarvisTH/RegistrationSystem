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
        List<RefundRecord> refundRecords=refundRecordService.getRefundRecords();
        model.addAttribute("refundRecords",refundRecords);
        return "admin/list/listRefundRecord";
    }

    @RequestMapping("updateRefundRecord")
    public String updateRefundRecord(int id,int cancelOrderId,String finish){
        RefundRecord refundRecord=new RefundRecord();
        refundRecord.setId(id);
        refundRecord.setCancelOrderId(cancelOrderId);
        refundRecord.setFinish(finish);
        refundRecordService.updateRefundRecord(refundRecord);
        return "redirect:admin/list/listRefundRecord";
    }

    @RequestMapping("deleteRefundRecord")
    public String deleteRefundRecord(int id){
        refundRecordService.deleteRefundRecord(id);
        return "redirect:admin/list/listRefundRecord";
    }

    @RequestMapping("addRefundRecord")
    public String addRefundRecord(Model model){
        //传来参数或者实例
        RefundRecord refundRecord=new RefundRecord();
        refundRecordService.addRefundRecord(refundRecord);
        return "redirect:admin/list/listRefundRecord";
    }

    @RequestMapping("getRefundRecordListByPara")
    public String getRefundRecordListByPara(int cancelOrderId, Model model){
        List<RefundRecord> refundRecords=refundRecordService.getRefundRecordList(cancelOrderId);
        model.addAttribute("refundRecords",refundRecords);
        return "admin/list/listRefundRecord";
    }
}
