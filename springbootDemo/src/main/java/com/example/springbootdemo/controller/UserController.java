package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

   @Autowired
   private UserService userService;

    @RequestMapping(value = "/allUser" )
    public String getallUser(Model model){
        model.addAttribute("userList",userService.allUser());
        return "allUser";
    }

    @RequestMapping ("/getOne")
    public String oneUser(Model model, @RequestParam(value = "username",defaultValue = "null")String username){

        if ((userService.oneUser(username) == null) && (username != null)){
            model.addAttribute("no","it is nothing here");
        }else {
            model.addAttribute("userList",userService.oneUser(username));
        }
        return "allUser";

    }

    @RequestMapping("/updateUser")
    public String updateUser(@RequestParam(value = "username",required = true)String username,@RequestParam(value = "sex",required = true)String sex,Model model){

        if ((username != null)&&(sex != null)) {
            User user = userService.oneUser(username);
            user.setSex(sex);
            userService.updateUser(user);
        }
       return "updateUser";
    }
}
