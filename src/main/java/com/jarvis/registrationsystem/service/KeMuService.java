package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.KeMu;

import java.util.List;

public interface KeMuService {
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
