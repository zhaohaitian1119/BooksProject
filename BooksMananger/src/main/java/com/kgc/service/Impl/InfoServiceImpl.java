package com.kgc.service.Impl;

import com.github.pagehelper.PageHelper;
import com.kgc.mapper.InfoMapper;
import com.kgc.pojo.Info;
import com.kgc.pojo.InfoExample;
import com.kgc.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Resource
    InfoMapper infoMapper;

    @Override
    public List<Info> selectByTypeAndNameAndisBorrow(Integer bookType, String bookName, Integer isBorrow, Integer pageNum, Integer pageSize) {
        System.out.println(bookType + ":" + bookName + ":" + isBorrow);
        InfoExample example = new InfoExample();
        InfoExample.Criteria criteria = example.createCriteria();
        if (bookType != 0) {
            criteria.andBookTypeEqualTo(bookType);
        }
        if (bookName != "") {
            criteria.andBookNameLike("%" + bookName + "%");
        }
        if (isBorrow != 2) {
            criteria.andIsBorrowEqualTo(isBorrow);
        }
        PageHelper.startPage(pageNum, pageSize);
      /*  PageHelper.orderBy("created_time desc");*/
        List<Info> infos = infoMapper.selectByExample(example);
        return infos;
    }
}
