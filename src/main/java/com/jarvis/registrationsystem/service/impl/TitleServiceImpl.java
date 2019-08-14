package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.TitleDao;
import com.jarvis.registrationsystem.pojo.Title;
import com.jarvis.registrationsystem.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TitleServiceImpl implements TitleService {

    @Autowired
    private TitleDao titleDao;

    @Override
    public int addTitle(Title title){
        return titleDao.addTitle(title);
    }

    @Override
    public int deleteTitle(Title title){
        return titleDao.deleteTitle(title);
    }

    @Override
    public int updateTitle(Title title){
        return titleDao.updateTitle(title);
    }

    @Override
    public List<Title> getTitles(){
        return titleDao.getTitles();
    }
}
