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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContext;

import java.awt.image.renderable.RenderContext;

@Controller
@SessionAttributes(value = "loginUser")
public class UserController {

    @RequestMapping("/user/{id}")//路径参数
    public String query(@PathVariable("id") int id){
        System.out.println(id);
        return null;
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        RequestContext renderContext = new RequestContext(request);
        System.out.println(renderContext.getMessage("username"));
        return "login";
    }

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
