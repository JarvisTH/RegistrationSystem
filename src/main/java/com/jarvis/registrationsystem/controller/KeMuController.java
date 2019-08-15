package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.KeMu;
import com.jarvis.registrationsystem.service.KeMuService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class KeMuController {
    @Autowired
    private KeMuService keMuService;

    @RequestMapping("listKeMu")
    public String listKeMu(Model model){
        List<KeMu> km=keMuService.getKeMus();
        model.addAttribute("km",km);//把集合放入km中
        return "admin/listKeMu";//跳转到"admin/listKeMu"视图
    }

    @RequestMapping("updateKeMu")
    public String updateKeMu(Model model){
        //传来id号,name
        KeMu keMu=new KeMu();
        keMu.setId();
        keMu.setName();
        keMuService.updateKeMu(keMu);
        return "admin/listKeMu";
    }

    @RequestMapping("addKeMu")
    public String addKeMu(Model model){
        //传来id号,name
        KeMu keMu=new KeMu();
        keMu.setId();
        keMu.setName();
        keMuService.addKeMu(keMu);
        return "admin/listKeMu";
    }

    @RequestMapping("deleteKeMu")
    public String deleteKeMu(Model model){
        //传来id
        keMuService.deleteKeMu(id);
        return "admin/listKeMu";
    }

}
