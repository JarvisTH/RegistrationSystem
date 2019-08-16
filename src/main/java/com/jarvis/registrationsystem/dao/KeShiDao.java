package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.KeShi;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeShiDao {
    /**
     * 添加
     * @param keShi
     * @return
     */
    int addKeShi(KeShi keShi);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteKeShi(int id);

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

    /**
     * 根据参数搜索
     * @param id
     * @param name
     * @return
     */
    List<KeShi> getKeShiList(int id,String name);
}
