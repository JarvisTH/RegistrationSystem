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
        List<KeShi> ks=keShiService.getKeShis();
        model.addAttribute("ks",ks);
        return "admin/listKeShi";
    }

    @RequestMapping("updateKeShi")
    public String updateKeShi(Model model){
        //传来id号,name
        KeShi keShi=new KeShi();
        keShi.setId();
        keShi.setName();
        keShiService.updateKeShi(keShi);
        return "admin/listKeShi";
    }

    @RequestMapping("addKeShi")
    public String addKeShi(Model model){
        //传来id号,name
        KeShi keShi=new KeShi();
        keShi.setId();
        keShi.setName();
        keShiService.addKeShi(keShi);
        return "admin/listKeShi";
    }

    @RequestMapping("deleteKeShi")
    public String deleteKeShi(Model model){
        //传来id
        keShiService.deleteKeShi(id);
        return "admin/listKeShi";
    }

    @RequestMapping("getKeShiList")
    public String getKeShiList(Model model){
        //传来id和name
        List<KeShi> keShis=keShiService.getKeShiList(id,name);
        model.addAttribute("keShis",keShis);
        return "admin/listKeShi";
    }

}
