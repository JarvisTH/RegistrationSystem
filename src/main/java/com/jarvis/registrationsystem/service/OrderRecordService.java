package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.OrderRecord;

import java.util.List;

public interface OrderRecordService {

    int addOrderRecord(OrderRecord orderRecord);

    int deleteOrderRecord(int id);

    int updateOrderRecord(OrderRecord orderRecord);

    List<OrderRecord> getOrderRecords();
}
