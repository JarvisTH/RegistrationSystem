package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.CancelOrderMapper;
import com.jarvis.registrationsystem.pojo.CancelOrder;
import com.jarvis.registrationsystem.service.CancelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class CancelOrderServiceImpl implements CancelOrderService {
    @Autowired
    private CancelOrderMapper cancelOrderMapper=null;

   @Override
    public int addCancelOrder(CancelOrder cancelOrder){
        return cancelOrderMapper.addCancelOrder(cancelOrder);
    }

    @Override
    public int deleteCancelOrder(int id){
        return cancelOrderMapper.deleteCancelOrder(id);
    }

    @Override
    public int updateCancelOrder(CancelOrder cancelOrder){
        return cancelOrderMapper.updateCancelOrder(cancelOrder);
    }

    @Override
    public List<CancelOrder> getCancelOrders(){
        return cancelOrderMapper.getCancelOrders();
    }

    @Override
    public List<CancelOrder> getCancelOrderList(int scheduleId,String keMu,String keShi){
       return cancelOrderMapper.getCancelOrderList(scheduleId,keMu,keShi);
    }
}
