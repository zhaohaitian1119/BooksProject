package com.kgc.service;

import com.kgc.pojo.Info;

import java.util.List;

public interface InfoService {
    List<Info> selectByTypeAndNameAndisBorrow(Integer bookType, String bookName, Integer isBorrow, Integer pageNum, Integer pageSize);
}
