package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class IndexController{
    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request,HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","jump success");
        return modelAndView;
    }

    @RequestMapping("/jump")
    public ModelAndView jump(){
        ModelAndView modelAndView = new ModelAndView("redirect:/index");
        return modelAndView;
    }
}
