package com.kgc.service.impl;

import com.kgc.mapper.Book_infoMapper;
import com.kgc.pojo.Book_info;
import com.kgc.pojo.Book_infoExample;
import com.kgc.service.BookServicecx;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookService")
public class BookServicecxImpl implements BookServicecx {
    @Resource
    Book_infoMapper book_infoMapper;

    @Override
    public List<Book_info> selectBook(Integer book_type, Integer is_borrow, String book_name, int pageIndex, int pageSize) {
        Book_infoExample book_infoExample=new Book_infoExample();
        Book_infoExample.Criteria criteria = book_infoExample.createCriteria();
        if(book_type!=null&&book_type!=0){
            criteria.andBookTypeEqualTo(book_type);
        }else if(is_borrow!=null&&book_type!=0){
            criteria.andIsBorrowEqualTo(is_borrow);
        }else if(book_name!=null){
            criteria.andBookNameLike("%"+book_name+"%");
        }else {
            return book_infoMapper.selectByExample(null);
        }
        return book_infoMapper.selectByExample(book_infoExample);
    }

    @Override
    public int updBorrow(Book_info book_info) {
        return book_infoMapper.updateByPrimaryKeySelective(book_info);
    }
}
