package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.KeShiMapper;
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
    private KeShiMapper keShiMapper=null;

    @Override
    public int addKeShi(String name){
        return keShiMapper.addKeShi(name);
    }

    @Override
    public int deleteKeShi(int id){
        return keShiMapper.deleteKeShi(id);
    }

    @Override
    public int updateKeShi(KeShi keShi){
        return keShiMapper.updateKeShi(keShi);
    }

    @Override
    public List<KeShi> getKeShis(){
        return keShiMapper.getKeShis();
    }

    @Override
    public List<KeShi> getKeShiList(int id,String name){
        return keShiMapper.getKeShiList(id,name);
    }
}
