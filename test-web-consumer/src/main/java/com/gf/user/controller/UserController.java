package com.gf.user.controller;

import com.gf.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by guofei on 2017/4/4.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello/test/world")
    @ResponseBody
    public String sayHello(){
        String rtn = userService.sayHello()+"**************************";
        System.out.println(rtn);
        return rtn;
    }
}
