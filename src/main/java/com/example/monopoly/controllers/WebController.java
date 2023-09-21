package com.example.monopoly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/play")
    public String play(){
        return "board.html";
    }
}
