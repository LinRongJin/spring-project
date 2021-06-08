package controller;

import entity.Score;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddScore {
    @RequestMapping("/addScore")
    public ModelAndView addScore(Score score){
        System.out.println("is run");
        System.out.println(score.getScore());
        ModelAndView modelAndView = new ModelAndView("showScore");
        return modelAndView;
    }
}
