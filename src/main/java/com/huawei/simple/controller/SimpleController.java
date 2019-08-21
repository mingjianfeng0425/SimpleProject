package com.huawei.simple.controller;

import com.huawei.simple.service.api.IUserManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SimpleController {

    @Autowired
    IUserManagement userManagement;

    /**
     * is a simple example
     * @return
     */
    @ResponseBody
    @RequestMapping("/simple")
    public String getName(){
        List<String> userNameList = userManagement.getUserName();
        String names = userNameList.toString();
        return names;
    }
}
