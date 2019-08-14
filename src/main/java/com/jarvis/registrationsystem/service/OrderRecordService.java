package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.OrderRecord;

import java.util.List;

public interface OrderRecordService {
    /**
     * 添加
     * @param orderRecord
     * @return
     */
    int addOrderRecord(OrderRecord orderRecord);

    /**
     * 删除
     * @param orderRecord
     * @return
     */
    int deleteOrderRecord(OrderRecord orderRecord);

    /**
     * 更新
     * @param orderRecord
     * @return
     */
    int updateOrderRecord(OrderRecord orderRecord);

    /**
     * 获取列表
     * @return
     */
    List<OrderRecord> getOrderRecords();
}
