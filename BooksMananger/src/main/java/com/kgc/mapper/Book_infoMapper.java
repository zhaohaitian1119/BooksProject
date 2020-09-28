package com.kgc.mapper;

import com.kgc.pojo.Book_info;
import com.kgc.pojo.Book_infoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Book_infoMapper {
    int countByExample(Book_infoExample example);

    int deleteByExample(Book_infoExample example);

    int deleteByPrimaryKey(Long bookId);

    int insert(Book_info record);

    int insertSelective(Book_info record);

    List<Book_info> selectByExample(Book_infoExample example);

    Book_info selectByPrimaryKey(Long bookId);

    int updateByExampleSelective(@Param("record") Book_info record, @Param("example") Book_infoExample example);

    int updateByExample(@Param("record") Book_info record, @Param("example") Book_infoExample example);

    int updateByPrimaryKeySelective(Book_info record);

    int updateByPrimaryKey(Book_info record);
}