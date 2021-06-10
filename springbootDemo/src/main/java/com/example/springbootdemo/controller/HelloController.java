package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
    @Autowired
    UserService userService;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return userService.allUser().toString();
    }
}
