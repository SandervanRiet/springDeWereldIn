package com.example.springdewereldin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private int specialNumber;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("specialnumber",specialNumber);
        return "home";
    }
}
