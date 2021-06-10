package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

   @Autowired
   private UserService userService;

    @RequestMapping("/allUser")
    public String getallUser(Model model){
        model.addAttribute("userList",userService.allUser());
        return "allUser";
    }
}
