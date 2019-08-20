package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.OrderRecordMapper;
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
    private OrderRecordMapper orderRecordMapper=null;

    @Override
    public int addOrderRecord(OrderRecord orderRecord){
        return orderRecordMapper.addOrderRecord(orderRecord);
    }

    @Override
    public int deleteOrderRecord(int id){
        return orderRecordMapper.deleteOrderRecord(id);
    }

    @Override
    public int updateOrderRecord(OrderRecord orderRecord){
        return orderRecordMapper.updateOrderRecord(orderRecord);
    }

    @Override
    public List<OrderRecord> getOrderRecords(){
        return orderRecordMapper.getOrderRecords();
    }

    @Override
    public List<OrderRecord> getOrderRecordList(int scheduleId,String keMu,String keShi){
        return orderRecordMapper.getOrderRecordList(scheduleId,keMu,keShi);
    }
}
