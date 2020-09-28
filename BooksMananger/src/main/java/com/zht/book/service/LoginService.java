package com.zht.book.service;

import com.zht.book.pojo.BookInfo;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-28 14:31
 */
public interface LoginService {
    int CountByCodeByPwd(String Code,String pwd);

    List<BookInfo> selAll(Integer booktype,String bookname,Integer isborrw);
}
