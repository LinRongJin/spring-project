package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.Charset;

@Controller
public class HelloController {

    @RequestMapping("/")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("message","aljfkadye ");
        return modelAndView;
    }
}
