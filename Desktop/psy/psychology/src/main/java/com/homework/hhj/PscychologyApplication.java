package com.homework.hhj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * spring boot 启动类
 */
@Controller //返回HTML页面
//@RestController
@SpringBootApplication
//@EnableWebMvc
public class PscychologyApplication {

    /*@RequestMapping("/")
    public String hello(){
        System.out.println("i am coming!");
        return "hello world!";
    }*/


    @RequestMapping(value = "/thymeleaf", method = RequestMethod.GET)
    public ModelAndView index2(Model model){
        System.out.println("启用了thymeleaf!");
        model.addAttribute("name","hello world!");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("thymeleaf_test");
        mav.addAllObjects(model.asMap());
        return mav;

        //return "thymeleaf_test";
    }


    public static void main(String[] args){
        SpringApplication.run(PscychologyApplication.class,args);
    }
}
