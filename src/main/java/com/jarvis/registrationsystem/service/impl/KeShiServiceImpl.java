package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.KeShiDao;
import com.jarvis.registrationsystem.pojo.KeShi;
import com.jarvis.registrationsystem.service.KeShiService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class KeShiServiceImpl implements KeShiService {
    @Autowired
    private KeShiDao keShiDao;

    @Override
    public int addKeShi(KeShi keShi){
        return keShiDao.addKeShi(keShi);
    }

    @Override
    public int deleteKeShi(KeShi keShi){
        return keShiDao.deleteKeShi(keShi);
    }

    @Override
    public int updateKeShi(KeShi keShi){
        return keShiDao.updateKeShi(keShi);
    }

    @Override
    public List<KeShi> getKeShis(){
        return keShiDao.getKeShis();
    }
}
