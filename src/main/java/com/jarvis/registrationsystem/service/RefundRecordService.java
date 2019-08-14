package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.RefundRecord;

import java.util.List;

public interface RefundRecordService {
    /**
     * 添加
     * @param refundRecord
     * @return
     */
    int addPatientLoginLog(RefundRecord refundRecord);

    /**
     * 删除
     * @param refundRecord
     * @return
     */
    int deletePatientLoginLog(RefundRecord refundRecord);

    /**
     * 更新
     * @param refundRecord
     * @return
     */
    int updatePatientLoginLog(RefundRecord refundRecord);

    /**
     * 获取列表
     * @return
     */
    List<RefundRecord> getPatientLoginLogs();
}
