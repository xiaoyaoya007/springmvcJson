package com.etc.controller;

import com.etc.vo.LoginReq;
import com.etc.vo.LoginResp;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes(value = "loginUser")
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

    @RequestMapping("/login2.do")
    @ResponseBody
//    设置session方式一(生命周期：浏览器窗口)
//    public LoginResp login2(String username, HttpSession session){
//        session.setAttribute("loginUser",username);
//        return null;
//    }
//    设置session方式二
    public LoginResp login2( String username, Model model){
        model.addAttribute("loginUser",username);
        return null;
    }

    //    设置cookie
    @RequestMapping("/cookie")
    public String cookie(HttpServletResponse response){
        Cookie cookie = new Cookie("name", "jiang");
        response.addCookie(cookie);
        return null;
    }
    @RequestMapping("/getcookie")
    public String getcookie(@CookieValue("name") String name){
        System.out.println("name:"+name);
        return null;
    }


}
