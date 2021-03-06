package com.jarvis.registrationsystem.dao;

import com.jarvis.registrationsystem.pojo.Title;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitleMapper {
    /**
     * 添加
     * @param title
     * @return
     */
    int addTitle(Title title);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteTitle(int id);

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

    /**
     * 根据参数获取列表
     * @param id
     * @param name
     * @return
     */
    List<Title> getTitleList(@Param("id") int id,@Param("name") String name);
}
