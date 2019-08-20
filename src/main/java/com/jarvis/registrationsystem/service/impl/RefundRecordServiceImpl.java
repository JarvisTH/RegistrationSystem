package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.RefundRecordMapper;
import com.jarvis.registrationsystem.pojo.RefundRecord;
import com.jarvis.registrationsystem.service.RefundRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
public class RefundRecordServiceImpl implements RefundRecordService {

    @Autowired
    private RefundRecordMapper refundRecordMapper=null;

    @Override
    public int addRefundRecord(RefundRecord refundRecord){
        return refundRecordMapper.addRefundRecord(refundRecord);
    }

    @Override
    public int deleteRefundRecord(int id){
        return refundRecordMapper.deleteRefundRecord(id);
    }

    @Override
    public int updateRefundRecord(RefundRecord refundRecord){
        return refundRecordMapper.updateRefundRecord(refundRecord);
    }

    @Override
    public List<RefundRecord> getRefundRecords(){
        return refundRecordMapper.getRefundRecords();
    }

    @Override
    public List<RefundRecord> getRefundRecordList(int cancelOrderId){
        return refundRecordMapper.getRefundRecordList(cancelOrderId);
    }
}
