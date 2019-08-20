package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.KeMu;
import com.jarvis.registrationsystem.service.KeMuService;
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
        List<KeMu> keMus=keMuService.getKeMus();
        model.addAttribute("keMus",keMus);
        return "admin/list/listKeMu";
    }

    @RequestMapping("updateKeMu")
    public String updateKeMu(int id,String name){
        KeMu keMu=new KeMu();
        keMu.setId(id);
        keMu.setName(name);
        keMuService.updateKeMu(keMu);
        return "redirect:admin/list/listKeMu";//是否重定向到实例详细页面
    }

    @RequestMapping("addKeMu")
    public String addKeMu(String name){
        keMuService.addKeMu(name);
        return "redirect:admin/list/listKeMu";//是否重定向到实例详细页面
    }

    @RequestMapping("deleteKeMu")
    public String deleteKeMu(int id){
        keMuService.deleteKeMu(id);
        return "redirect:admin/list/listKeMu";
    }

    @RequestMapping("getKeMuListByPara")
    public String getKeMuListByPara(int id, String name, Model model){
        List<KeMu> keMus=keMuService.getKeMuList(id,name);
        model.addAttribute("keMus",keMus);
        return "admin/list/listKeMu";
    }

}
