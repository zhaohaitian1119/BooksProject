package com.kgc.servlce.impl;

import com.kgc.mapper.UsersMapper;
import com.kgc.pojo.Users;
import com.kgc.pojo.UsersExample;
import com.kgc.servlce.UserServlce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("userService")
public class UserServlceImpl implements UserServlce {
    @Resource
    UsersMapper usersMapper;
    @Override
    public Users selectUser(String user_code) {

        Users users=null;
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUserCodeEqualTo(user_code);
        List<Users> usersList = usersMapper.selectByExample(usersExample);
        if(usersList.size()>0){
            users=usersList.get(0);
        }
        return users;
    }
}
