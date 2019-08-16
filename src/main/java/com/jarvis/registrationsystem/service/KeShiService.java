package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.KeShi;

import java.util.List;

public interface KeShiService {

    int addKeShi(String name);

    int deleteKeShi(int id);

    int updateKeShi(KeShi keShi);

    List<KeShi> getKeShis();

    List<KeShi> getKeShiList(int id,String name);
}
