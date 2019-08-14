package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.KeMu;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface KeMuDao {
    /**
     * 添加
     * @param keMu
     * @return
     */
    int addKeMu(String keMu);

    /**
     * 删除
     * @param keMu
     * @return
     */
    int deleteKeMu(KeMu keMu);

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
}
