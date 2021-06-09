package controller;

import entity.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class IndexController{
    @Autowired
    private UserMapper userMapper;

   @RequestMapping("/showUser")
    public ModelAndView indexController(HttpServletRequest request,HttpServletResponse response){
       ModelAndView modelAndView = new ModelAndView("showUser");
       List<User> userList = userMapper.allUser();
       modelAndView.addObject("message", userList.get(0));
       return modelAndView;
   }
}
