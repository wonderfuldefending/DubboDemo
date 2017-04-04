package com.gf.user.serviceImpl;

import com.gf.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by guofei on 2017/4/4.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    public String sayHello() {
        System.out.println("hello world----------------------------");
        return "hello world : guofei";
    }
}
