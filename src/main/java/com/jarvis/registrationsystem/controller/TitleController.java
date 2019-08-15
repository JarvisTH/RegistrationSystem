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
        return "admin/listTitle";
    }

    @RequestMapping("updateTitle")
    public String updateTitle(Model model){
        //传来参数或者实例
        Title title=new Title();
        titleService.updateTitle(title);
        return "admin/listTitle";
    }

    @RequestMapping("deleteTitle")
    public String deleteTitle(Model model){
        //传来id
        titleService.deleteTitle(id);
        return "admin/listTitle";
    }

    @RequestMapping("addTitle")
    public String addTitle(Model model){
        //传来参数或实例
        Title title=new Title();
        titleService.addTitle(title);
        return "admin/listTitle";
    }
}
