package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.KeMu;
import com.jarvis.registrationsystem.service.KeMuService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("")
public class KeMuController {

    @Autowired
    private KeMuService keMuService;

    @RequestMapping("listKeMu")
    public String listKeMu(List<KeMu> keMus,Model model){
        if(keMus==null){
            keMus=keMuService.getKeMus();
        }
        model.addAttribute("keMus",keMus);
        return "admin/listKeMu";
    }

    @RequestMapping("updateKeMu")
    public String updateKeMu(int id,String name){
        KeMu keMu=new KeMu();
        keMu.setId(id);
        keMu.setName(name);
        keMuService.updateKeMu(keMu);
        return "redirect:admin/listKeMu";//是否重定向到实例详细页面
    }

    @RequestMapping("addKeMu")
    public String addKeMu(String name){
        keMuService.addKeMu(name);
        return "redirect:admin/listKeMu";//是否重定向到实例详细页面
    }

    @RequestMapping("deleteKeMu")
    public String deleteKeMu(int id){
        keMuService.deleteKeMu(id);
        return "redirect:admin/listKeMu";
    }

    @RequestMapping("getKeMuListByPara")
    public String getKeMuListByPara(int id, String name, RedirectAttributes ra){
        List<KeMu> keMus=keMuService.getKeMuList(id,name);
        ra.addFlashAttribute("keMus",keMus); //重定向传递Java对象
        return "redirect:admin/listKeMu";
    }

}
