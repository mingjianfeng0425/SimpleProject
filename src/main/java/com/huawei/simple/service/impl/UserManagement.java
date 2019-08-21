package com.huawei.simple.service.impl;

import com.huawei.simple.service.api.IUserManagement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserManagement implements IUserManagement {

    @Override
    public List<String> getUserName() {
        List<String> userList = new ArrayList<>();
        userList.add("张三");
        userList.add("李四");
        userList.add("王五");
        userList.add("赵六");
        return userList;
    }
}
