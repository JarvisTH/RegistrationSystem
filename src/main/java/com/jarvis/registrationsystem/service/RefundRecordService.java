package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.RefundRecord;

import java.util.List;

public interface RefundRecordService {

    int addRefundRecord(RefundRecord refundRecord);

    int deleteRefundRecord(int id);

    int updateRefundRecord(RefundRecord refundRecord);

    List<RefundRecord> getRefundRecords();

    List<RefundRecord> getRefundRecordList(int cancelOrderId);

}
