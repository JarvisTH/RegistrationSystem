package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.CancelOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CancelOrderMapper {
    /**
     * 添加
     * @param cancelOrder
     * @return
     */
    int addCancelOrder(CancelOrder cancelOrder);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteCancelOrder(int id);

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

    /**
     * 根据参数获取列表
     * @param scheduleId
     * @param keMu
     * @param keShi
     * @return
     */
    List<CancelOrder> getCancelOrderList(@Param("scheduleId") int scheduleId,@Param("keMu") String keMu,@Param("keShi") String keShi);
}
