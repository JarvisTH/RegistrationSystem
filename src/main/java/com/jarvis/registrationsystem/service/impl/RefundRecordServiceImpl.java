package com.jarvis.registrationsystem.service.impl;

import com.jarvis.registrationsystem.dao.RefundRecordDao;
import com.jarvis.registrationsystem.pojo.RefundRecord;
import com.jarvis.registrationsystem.service.RefundRecordService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RefundRecordServiceImpl implements RefundRecordService {

    @Autowired
    private RefundRecordDao refundRecordDao;

    @Override
    public int addPatientLoginLog(RefundRecord refundRecord){
        return refundRecordDao.addPatientLoginLog(refundRecord);
    }

    @Override
    public int deletePatientLoginLog(RefundRecord refundRecord){
        return refundRecordDao.deletePatientLoginLog(refundRecord);
    }

    @Override
    public int updatePatientLoginLog(RefundRecord refundRecord){
        return refundRecordDao.updatePatientLoginLog(refundRecord);
    }

    @Override
    public List<RefundRecord> getPatientLoginLogs(){
        return refundRecordDao.getPatientLoginLogs();
    }
}
