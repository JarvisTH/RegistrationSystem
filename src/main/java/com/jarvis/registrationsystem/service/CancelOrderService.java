package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.CancelOrder;

import java.util.List;

public interface CancelOrderService {
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
