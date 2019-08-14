package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.RefundRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RefundRecordDao {
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
