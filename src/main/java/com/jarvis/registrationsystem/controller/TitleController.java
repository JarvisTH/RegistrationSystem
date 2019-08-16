package com.jarvis.registrationsystem.controller;

import com.jarvis.registrationsystem.pojo.Title;
import com.jarvis.registrationsystem.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("")
public class TitleController {
    @Autowired
    private TitleService titleService;

    @RequestMapping("listTitle")
    public String listTitle(List<Title> titles,Model model){
        if(titles==null){
            titles=titleService.getTitles();
        }
        model.addAttribute("titles",titles);
        return "admin/listTitle";
    }

    @RequestMapping("updateTitle")
    public String updateTitle(int id,String name,String price){
        Title title=new Title();
        title.setId(id);
        title.setName(name);
        title.setPrice(price);
        titleService.updateTitle(title);
        return "redirect:admin/listTitle";
    }

    @RequestMapping("deleteTitle")
    public String deleteTitle(int id){
        titleService.deleteTitle(id);
        return "redirect:admin/listTitle";
    }

    @RequestMapping("addTitle")
    public String addTitle(String name,String price){
        Title title=new Title();
        title.setName(name);
        title.setPrice(price);
        titleService.addTitle(title);
        return "redirect:admin/listTitle";
    }

    @RequestMapping("getTitleListByPara")
    public String getTitleListByPara(int id, String name, RedirectAttributes ra){
        List<Title> titles=titleService.getTitleList(id,name);
        ra.addAttribute("titles",titles);
        return "redirect:admin/listTitle";
    }
}
