package com.kgc.service;

import com.kgc.pojo.Book_info;

import java.util.List;

public interface BookServicecx {
    List<Book_info> selectBook(Integer book_type,Integer is_borrow,String book_name,int pageIndex,int pageSize);
    int updBorrow(Book_info book_info);
}
