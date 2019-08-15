package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.RefundRecordDao;
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
    private RefundRecordDao refundRecordDao=null;

    @Override
    public int addRefundRecord(RefundRecord refundRecord){
        return refundRecordDao.addRefundRecord(refundRecord);
    }

    @Override
    public int deleteRefundRecord(int id){
        return refundRecordDao.deleteRefundRecord(id);
    }

    @Override
    public int updateRefundRecord(RefundRecord refundRecord){
        return refundRecordDao.updateRefundRecord(refundRecord);
    }

    @Override
    public List<RefundRecord> getRefundRecords(){
        return refundRecordDao.getRefundRecords();
    }
}
