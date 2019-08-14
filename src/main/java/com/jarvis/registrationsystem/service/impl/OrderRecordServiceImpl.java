package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.OrderRecordDao;
import com.jarvis.registrationsystem.pojo.OrderRecord;
import com.jarvis.registrationsystem.service.OrderRecordService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderRecordServiceImpl implements OrderRecordService {

    @Autowired
    private OrderRecordDao orderRecordDao;

    @Override
    public int addOrderRecord(OrderRecord orderRecord){
        return orderRecordDao.addOrderRecord(orderRecord);
    }

    @Override
    public int deleteOrderRecord(OrderRecord orderRecord){
        return orderRecordDao.deleteOrderRecord(orderRecord);
    }

    @Override
    public int updateOrderRecord(OrderRecord orderRecord){
        return orderRecordDao.updateOrderRecord(orderRecord);
    }

    @Override
    public List<OrderRecord> getOrderRecords(){
        return orderRecordDao.getOrderRecords();
    }
}
