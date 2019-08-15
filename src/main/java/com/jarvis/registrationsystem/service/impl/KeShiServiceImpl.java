package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.KeShiDao;
import com.jarvis.registrationsystem.pojo.KeShi;
import com.jarvis.registrationsystem.service.KeShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class KeShiServiceImpl implements KeShiService {
    @Autowired
    private KeShiDao keShiDao=null;

    @Override
    public int addKeShi(KeShi keShi){
        return keShiDao.addKeShi(keShi);
    }

    @Override
    public int deleteKeShi(int id){
        return keShiDao.deleteKeShi(id);
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