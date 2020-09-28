package com.kgc.service;

import com.kgc.pojo.Users;

import java.util.List;

public interface UsersService {
    Users selectByUserCode(String userCode);
}
