package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.RefundRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RefundRecordDao {
    /**
     * 添加
     * @param refundRecord
     * @return
     */
    int addRefundRecord(RefundRecord refundRecord);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteRefundRecord(int id);

    /**
     * 更新
     * @param refundRecord
     * @return
     */
    int updateRefundRecord(RefundRecord refundRecord);

    /**
     * 获取列表
     * @return
     */
    List<RefundRecord> getRefundRecords();

    /**
     * 根据参数获取列表
     * @param cancelOrderId
     * @return
     */
    List<RefundRecord> getRefundRecordList(int cancelOrderId);
}
