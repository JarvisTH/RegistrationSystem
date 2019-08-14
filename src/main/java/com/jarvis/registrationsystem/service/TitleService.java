package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.Title;

import java.util.List;

public interface TitleService {
    /**
     * 添加
     * @param title
     * @return
     */
    int addTitle(Title title);

    /**
     * 删除
     * @param title
     * @return
     */
    int deleteTitle(Title title);

    /**
     * 更新
     * @param title
     * @return
     */
    int updateTitle(Title title);

    /**
     * 获取列表
     * @return
     */
    List<Title> getTitles();
}
