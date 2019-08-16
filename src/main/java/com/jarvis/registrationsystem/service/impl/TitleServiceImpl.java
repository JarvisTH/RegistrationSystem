package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.TitleDao;
import com.jarvis.registrationsystem.pojo.Title;
import com.jarvis.registrationsystem.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class TitleServiceImpl implements TitleService {

    @Autowired
    private TitleDao titleDao=null;

    @Override
    public int addTitle(Title title){
        return titleDao.addTitle(title);
    }

    @Override
    public int deleteTitle(int id){
        return titleDao.deleteTitle(id);
    }

    @Override
    public int updateTitle(Title title){
        return titleDao.updateTitle(title);
    }

    @Override
    public List<Title> getTitles(){
        return titleDao.getTitles();
    }

    @Override
    public List<Title> getTitleList(int id,String name){
        return titleDao.getTitleList(id,name);
    }
}
