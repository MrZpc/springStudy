package com.zengpc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/")
public class Hello  {

    @RequestMapping(value = "test")
    public String hello(Model model){
        model.addAttribute("msg","asdasd");
        return "test";
    }
}
