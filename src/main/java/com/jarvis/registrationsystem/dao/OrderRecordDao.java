package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.OrderRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRecordDao {
    /**
     * 添加
     * @param orderRecord
     * @return
     */
    int addOrderRecord(OrderRecord orderRecord);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteOrderRecord(int id);

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
