package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.Title;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TitleDao {
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
