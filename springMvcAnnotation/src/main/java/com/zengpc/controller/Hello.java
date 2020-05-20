package com.zengpc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/hello")
public class Hello  {

    @RequestMapping(value = "test/{a}/{b}")
    public String hello(@PathVariable int a,@PathVariable int b, Model model){
        model.addAttribute("msg","asdasd"+a+b);
        return "test";
    }
}
