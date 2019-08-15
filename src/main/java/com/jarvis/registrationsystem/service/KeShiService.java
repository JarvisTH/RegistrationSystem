package com.jarvis.registrationsystem.service;

import com.jarvis.registrationsystem.pojo.KeShi;

import java.util.List;

public interface KeShiService {

    int addKeShi(KeShi keShi);

    int deleteKeShi(int id);

    int updateKeShi(KeShi keShi);

    List<KeShi> getKeShis();
}
