package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.OrderRecordDao;
import com.jarvis.registrationsystem.pojo.OrderRecord;
import com.jarvis.registrationsystem.service.OrderRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class OrderRecordServiceImpl implements OrderRecordService {

    @Autowired
    private OrderRecordDao orderRecordDao=null;

    @Override
    public int addOrderRecord(OrderRecord orderRecord){
        return orderRecordDao.addOrderRecord(orderRecord);
    }

    @Override
    public int deleteOrderRecord(int id){
        return orderRecordDao.deleteOrderRecord(id);
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
