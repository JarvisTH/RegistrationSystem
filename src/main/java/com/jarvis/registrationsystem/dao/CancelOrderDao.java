package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.CancelOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CancelOrderDao {
    /**
     * 添加
     * @param cancelOrder
     * @return
     */
    int addCancelOrder(CancelOrder cancelOrder);

    /**
     * 删除
     * @param cancelOrder
     * @return
     */
    int deleteCancelOrder(CancelOrder cancelOrder);

    /**
     * 更新
     * @param cancelOrder
     * @return
     */
    int updateCancelOrder(CancelOrder cancelOrder);

    /**
     * 获取列表
     * @return
     */
    List<CancelOrder> getCancelOrders();
}
