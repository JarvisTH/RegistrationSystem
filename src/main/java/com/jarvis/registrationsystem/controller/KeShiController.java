package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.KeShi;
import com.jarvis.registrationsystem.service.KeShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class KeShiController {
    @Autowired
    private KeShiService keShiService;

    @RequestMapping("listKeShi")
    public String listKeShi(Model model){
        List<KeShi> keShis=keShiService.getKeShis();
        model.addAttribute("keShis",keShis);
        return "admin/list/listKeShi";
    }

    @RequestMapping("updateKeShi")
    public String updateKeShi(int id,String name){
        KeShi keShi=new KeShi();
        keShi.setId(id);
        keShi.setName(name);
        keShiService.updateKeShi(keShi);
        return "redirect:admin/list/listKeShi";
    }

    @RequestMapping("addKeShi")
    public String addKeShi(String name){
        keShiService.addKeShi(name);
        return "redirect:admin/list/listKeShi";
    }

    @RequestMapping("deleteKeShi")
    public String deleteKeShi(int id){
        keShiService.deleteKeShi(id);
        return "redirect:admin/list/listKeShi";
    }

    @RequestMapping("getKeShiListByPara")
    public String getKeShiListByPara(int id, String name, Model model){
        List<KeShi> keShis=keShiService.getKeShiList(id,name);
        model.addAttribute("keShis",keShis);
        return "admin/list/listKeShi";
    }

}
