package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.TitleMapper;
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
    private TitleMapper titleMapper=null;

    @Override
    public int addTitle(Title title){
        return titleMapper.addTitle(title);
    }

    @Override
    public int deleteTitle(int id){
        return titleMapper.deleteTitle(id);
    }

    @Override
    public int updateTitle(Title title){
        return titleMapper.updateTitle(title);
    }

    @Override
    public List<Title> getTitles(){
        return titleMapper.getTitles();
    }

    @Override
    public List<Title> getTitleList(int id,String name){
        return titleMapper.getTitleList(id,name);
    }
}
