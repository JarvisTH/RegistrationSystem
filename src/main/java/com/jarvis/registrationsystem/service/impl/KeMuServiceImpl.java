package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.KeMuDao;
import com.jarvis.registrationsystem.pojo.KeMu;
import com.jarvis.registrationsystem.service.KeMuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class KeMuServiceImpl implements KeMuService {

    @Autowired
    private KeMuDao keMuDao=null;

    @Override
    public int addKeMu(String keMu){
        return keMuDao.addKeMu(keMu);
    }

    @Override
    public int deleteKeMu(int id){
        return keMuDao.deleteKeMu(id);
    }

    @Override
    public int updateKeMu(KeMu keMu){
        return keMuDao.updateKeMu(keMu);
    }

    @Override
    public List<KeMu> getKeMus(){
        return keMuDao.getKeMus();
    }

    @Override
    public KeMu getKeMu(int id){
        return keMuDao.getKeMu(id);
    }

    @Override
    public List<KeMu> getKeMuList(int id,String name){
        return keMuDao.getKeMuList(id,name);
    }
}
