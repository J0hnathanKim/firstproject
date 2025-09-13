package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller

public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","Johnathan");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNextTime(Model model){
        model.addAttribute("nickname", "Johnathan");
        return "goodbye"; // goodbye.html
    }
}
