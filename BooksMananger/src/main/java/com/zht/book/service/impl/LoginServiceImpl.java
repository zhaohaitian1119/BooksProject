package com.zht.book.service.impl;

import com.zht.book.mapper.BookInfoMapper;
import com.zht.book.mapper.UsersMapper;
import com.zht.book.pojo.BookInfo;
import com.zht.book.pojo.BookInfoExample;
import com.zht.book.pojo.Users;
import com.zht.book.pojo.UsersExample;
import com.zht.book.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-28 14:31
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    UsersMapper usersMapper;
    @Resource
    BookInfoMapper bookInfoMapper;

    @Override
    public int CountByCodeByPwd(String Code, String pwd) {
        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUserCodeEqualTo(Code);
        criteria.andPasswordEqualTo(pwd);
        int i = usersMapper.countByExample(example);
        return i;
    }

    @Override
    public List<BookInfo> selAll(Integer booktype, String bookname, Integer isborrw) {
        BookInfoExample example = new BookInfoExample();
        BookInfoExample.Criteria criteria = example.createCriteria();
        if(bookname != ""){
            criteria.andBookNameLike("%"+bookname+"%");
        }
        if(booktype!=0){
            criteria.andBookTypeEqualTo(booktype);
        }
        if(isborrw != 2){
            criteria.andIsBorrowEqualTo(isborrw);
        }
        List<BookInfo> bookInfos = bookInfoMapper.selectByExample(example);
        return bookInfos;
    }

//    @Override
//    public List<BookInfo> selAll() {
//        List<BookInfo> bookInfos = bookInfoMapper.selectByExample(null);
//        return bookInfos;
//    }
}
