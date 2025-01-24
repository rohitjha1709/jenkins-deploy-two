package com.example.deploytwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/a")
    public String msg(){
        return "Happy Weekend to you all";
    }
}
