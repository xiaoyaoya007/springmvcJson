package com.etc.exception;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver extends ExceptionHandlerExceptionResolver {
    @Override
    //如果代码出现异常就会进入这个方法处理
    protected ModelAndView doResolveHandlerMethodException(HttpServletRequest request, HttpServletResponse response, HandlerMethod handlerMethod, Exception exception) {
        System.out.println(exception);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("404");
        return modelAndView;
    }
}
