package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//代表这个类被spring接管，其中所有的方法，如果返回值是string，并有具体的页面可供跳转，则回被视图解析器解析
public class Controllerdemo2 {
    @RequestMapping("/d2")
    public String dem(Model model){
        model.addAttribute("msg","model");
        return "demo";
    }
}
