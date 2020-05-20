package com.zengpc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/helloTest1")
public class HelloTest1 {

    @RequestMapping(value = "test")
    public String test(String name,HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("msg",name);
        return "test";
    }
}
