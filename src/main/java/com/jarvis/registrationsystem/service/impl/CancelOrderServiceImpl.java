package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.CancelOrderDao;
import com.jarvis.registrationsystem.pojo.CancelOrder;
import com.jarvis.registrationsystem.service.CancelOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CancelOrderServiceImpl implements CancelOrderService {
    @Autowired
    private CancelOrderDao cancelOrderDao;

   @Override
    public int addCancelOrder(CancelOrder cancelOrder){
        return cancelOrderDao.addCancelOrder(cancelOrder);
    }

    @Override
    public int deleteCancelOrder(CancelOrder cancelOrder){
        return cancelOrderDao.deleteCancelOrder(cancelOrder);
    }

    @Override
    public int updateCancelOrder(CancelOrder cancelOrder){
        return cancelOrderDao.updateCancelOrder(cancelOrder);
    }

    @Override
    public List<CancelOrder> getCancelOrders(){
        return cancelOrderDao.getCancelOrders();
    }
}
