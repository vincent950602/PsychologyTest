package com.homework.hhj.controller;

import com.homework.hhj.Entity.Questionnaire;
import com.homework.hhj.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制器 作用: 根据路径匹配方法， 返回html页面
 */
@Controller
/**
 * 相当于 @Controller 和 @ResponseBody 的相结合
 */
//@RestController
public class DemoController {

    @RequestMapping(value = "/demo1", method = RequestMethod.GET)
    public String demo1(HttpServletRequest req, ModelMap map )
    {

        User user = new User();
        user.setId("123");
        user.setUsername("lsd19940421");

        map.put("userInfo",user);
        return "demo1";

    }

    @RequestMapping(value = "/questionnaire", method = RequestMethod.GET)
    public String demo2(Model model){
        model.addAttribute("questionnaire",new Questionnaire());
        return "questionnaire";
    }

    @PostMapping("/questionnaire")//相当于@RequestMapping(value = "/questionnaire", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Questionnaire questionnaire) {
        return "answer";
    }
}
