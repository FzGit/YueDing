package com.fz.yueding.controller;

import com.fz.yueding.base.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author Fanzy
 * @Description //TODO
 * @Date 2021/8/7 23:25
 */

@RestController
@RequestMapping("/yueding/web")
public class UserController {

    @GetMapping("/login")
    public Response login(String account, String password) {
        String info = "account is " + account + "and the password is " + password;
        return Response.success(info);
    }
}

