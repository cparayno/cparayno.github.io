package com.chari.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {

    @GetMapping("/welcome")
    public String index(Model model) {
        model.addAttribute("greeting", "Welcome to my page!");
        return "index";
    }
}
