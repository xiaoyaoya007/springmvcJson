package com.etc.controller;

import com.etc.vo.LoginReq;
import com.etc.vo.LoginResp;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/login.do")
    @ResponseBody
    public LoginResp login(@RequestBody LoginReq loginReq){
        LoginResp loginResp=new LoginResp();
        if("admin".equals(loginReq.getUsername())&&"123456".equals(loginReq.getPassword())){
            loginResp.setResult(true);
            loginResp.setMsg("成功");
        }else {
            loginResp.setResult(false);
            loginResp.setMsg("用户名或密码不对");

        }
        return loginResp;
    }

}
