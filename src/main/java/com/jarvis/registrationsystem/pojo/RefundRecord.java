package com.jarvis.registrationsystem.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value = "refund_record")
public class RefundRecord {
    private int id;
    private String cancelOrderId;
    private String finish;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCancelOrderId() {
        return cancelOrderId;
    }

    public void setCancelOrderId(String cancelOrderId) {
        this.cancelOrderId = cancelOrderId;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }
}
