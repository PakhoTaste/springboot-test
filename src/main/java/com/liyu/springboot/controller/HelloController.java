package com.liyu.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Demo class
 *
 * @author liyu
 * @date 2019/10/25
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("time" , new Date());
        String s = "222222222";
        System.out.println(s);
        model.addAttribute("str" , s);

        return  "hello";
    }
}
