package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.Title;

import java.util.List;

public interface TitleService {

    int addTitle(Title title);

    int deleteTitle(int id);

    int updateTitle(Title title);

    List<Title> getTitles();
}
