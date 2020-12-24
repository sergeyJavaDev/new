package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public  String mainPage(@RequestParam(name="name", required=false, defaultValue="World") String text, Model model){
        model.addAttribute("name", text);
        return "mainPage";
    }
}
