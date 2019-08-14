package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.KeMuDao;
import com.jarvis.registrationsystem.pojo.KeMu;
import com.jarvis.registrationsystem.service.KeMuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class KeMuServiceImpl implements KeMuService {

    @Autowired
    private KeMuDao keMuDao;

    @Override
    public int addKeMu(String keMu){
        return keMuDao.addKeMu(keMu);
    }

    @Override
    public int deleteKeMu(KeMu keMu){
        return keMuDao.deleteKeMu(keMu);
    }

    @Override
    public int updateKeMu(KeMu keMu){
        return keMuDao.updateKeMu(keMu);
    }

    @Override
    public List<KeMu> getKeMus(){
        return keMuDao.getKeMus();
    }
}
