package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.KeShi;
import com.jarvis.registrationsystem.service.KeShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("")
public class KeShiController {
    @Autowired
    private KeShiService keShiService;

    @RequestMapping("listKeShi")
    public String listKeShi(List<KeShi> keShis,Model model){
        if(keShis==null){
            keShis=keShiService.getKeShis();
        }
        model.addAttribute("keShis",keShis);
        return "admin/listKeShi";
    }

    @RequestMapping("updateKeShi")
    public String updateKeShi(int id,String name){
        KeShi keShi=new KeShi();
        keShi.setId(id);
        keShi.setName(name);
        keShiService.updateKeShi(keShi);
        return "redirect:admin/listKeShi";
    }

    @RequestMapping("addKeShi")
    public String addKeShi(String name){
        keShiService.addKeShi(name);
        return "redirect:admin/listKeShi";
    }

    @RequestMapping("deleteKeShi")
    public String deleteKeShi(int id){
        keShiService.deleteKeShi(id);
        return "redirect:admin/listKeShi";
    }

//    @RequestMapping("getKeShiList")
//    public String getKeShiList(int id, String name, RedirectAttributes ra){
//        List<KeShi> keShis=keShiService.getKeShiList(id,name);
//        model.addAttribute("keShis",keShis);
//        return "admin/listKeShi";
//    }

    @RequestMapping("getKeShiListByPara")
    public String getKeShiListByPara(int id, String name, RedirectAttributes ra){
        List<KeShi> keShis=keShiService.getKeShiList(id,name);
        ra.addAttribute("keShis",keShis);
        return "redirect:admin/listKeShi";
    }

}
