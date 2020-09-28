package com.kgc.service.Impl;

import com.kgc.mapper.UsersMapper;
import com.kgc.pojo.Users;
import com.kgc.pojo.UsersExample;
import com.kgc.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    UsersMapper usersMapper;

    @Override
    public Users selectByUserCode(String userCode) {
        Users users = null;
        UsersExample exampl = new UsersExample();
        UsersExample.Criteria criteria = exampl.createCriteria();
        criteria.andUserCodeEqualTo(userCode);
        List<Users> usersList = usersMapper.selectByExample(exampl);
        if (usersList != null && usersList.size() > 0) {
            users = usersList.get(0);
        }
        return users;
    }
}
