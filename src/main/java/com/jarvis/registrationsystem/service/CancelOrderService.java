package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.CancelOrder;

import java.util.List;

public interface CancelOrderService {

    int addCancelOrder(CancelOrder cancelOrder);

    int deleteCancelOrder(int id);

    int updateCancelOrder(CancelOrder cancelOrder);

    List<CancelOrder> getCancelOrders();

    List<CancelOrder> getCancelOrderList(int scheduleId,String keMu,String keShi);
}
