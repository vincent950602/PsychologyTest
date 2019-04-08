package com.homework.hhj.controller;

import com.homework.hhj.Entity.PsychologySubmit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PsyQuesController {
    @GetMapping("/index")
    public String psychologyQues(Model model){
        model.addAttribute("psychologySubmit",new PsychologySubmit());
        return "index";
    }

    @PostMapping("/index")
    public String psychologySub(@ModelAttribute PsychologySubmit psychologySubmit){
        return "submit";
    }

}
