package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.KeShi;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KeShiDao {
    /**
     * 添加
     * @param keShi
     * @return
     */
    int addKeShi(KeShi keShi);

    /**
     * 删除
     * @param keShi
     * @return
     */
    int deleteKeShi(KeShi keShi);

    /**
     * 更新
     * @param keShi
     * @return
     */
    int updateKeShi(KeShi keShi);

    /**
     * 获取列表
     * @return
     */
    List<KeShi> getKeShis();
}
