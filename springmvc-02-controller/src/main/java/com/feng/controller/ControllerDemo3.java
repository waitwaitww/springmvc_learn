package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo3 {

    @RequestMapping("/d3/{a}/{b}")
    public String d22(@PathVariable int a, @PathVariable int b, Model model){
        int res = a +b;
        model.addAttribute("msg","jieguo:"+res);
        return "demo";
    }
}
