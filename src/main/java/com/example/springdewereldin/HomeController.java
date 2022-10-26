package com.example.springdewereldin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${specialnumber:1111}")
    private int specialNumber;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("specialnumber",specialNumber);
        return "home";
    }
}
