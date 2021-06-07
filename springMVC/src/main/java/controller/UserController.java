package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/addUser")
    public ModelAndView addUser(User user){
        ModelAndView modelAndView = new ModelAndView("showUser");
        return modelAndView;
    }
}
