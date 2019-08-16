package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.KeMu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeMuDao {
    /**
     * 添加
     * @param keMu
     * @return
     */
    int addKeMu(String keMu);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteKeMu(int id);

    /**
     * 更新
     * @param keMu
     * @return
     */
    int updateKeMu(KeMu keMu);

    /**
     * 获取列表
     * @return
     */
    List<KeMu> getKeMus();

    /**
     * 获取某个实例
     * @param id
     * @return
     */
    KeMu getKeMu(int id);

    /**
     * 根据参数获取列表
     * @param id
     * @param name
     * @return
     */
    List<KeMu> getKeMuList(int id,String name);
}
