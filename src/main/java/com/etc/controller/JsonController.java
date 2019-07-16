package com.etc.controller;

import com.etc.vo.Calc;
import com.etc.vo.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
    @RequestMapping(value = "/sum.do")
    @ResponseBody//返回到就是json
    public Result json(@RequestBody Calc calc){
        System.out.println(calc);
        int sum = calc.getA()+calc.getB();
        Result result=new Result(sum);
        return result;
    }
}
