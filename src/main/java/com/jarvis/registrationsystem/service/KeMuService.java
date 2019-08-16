package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.KeMu;

import java.util.List;

public interface KeMuService {

    int addKeMu(String keMu);

    int deleteKeMu(int id);

    int updateKeMu(KeMu keMu);

    List<KeMu> getKeMus();

    KeMu getKeMu(int id);

    List<KeMu> getKeMuList(int id,String name);
}
