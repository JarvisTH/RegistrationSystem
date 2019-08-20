package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.Title;
import com.jarvis.registrationsystem.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class TitleController {
    @Autowired
    private TitleService titleService;

    @RequestMapping("listTitle")
    public String listTitle(Model model){
        List<Title> titles=titleService.getTitles();
        model.addAttribute("titles",titles);
        return "admin/list/listTitle";
    }

    @RequestMapping("updateTitle")
    public String updateTitle(int id,String name,String price){
        Title title=new Title();
        title.setId(id);
        title.setName(name);
        title.setPrice(price);
        titleService.updateTitle(title);
        return "redirect:admin/list/listTitle";
    }

    @RequestMapping("deleteTitle")
    public String deleteTitle(int id){
        titleService.deleteTitle(id);
        return "redirect:admin/list/listTitle";
    }

    @RequestMapping("addTitle")
    public String addTitle(String name,String price){
        Title title=new Title();
        title.setName(name);
        title.setPrice(price);
        titleService.addTitle(title);
        return "redirect:admin/list/listTitle";
    }

    @RequestMapping("getTitleListByPara")
    public String getTitleListByPara(int id, String name, Model model){
        List<Title> titles=titleService.getTitleList(id,name);
        model.addAttribute("titles",titles);
        return "admin/list/listTitle";
    }
}
