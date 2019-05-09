package com.momen.test.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by momin on 5/9/19.
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String showHome(){
        return "index";
    }
}
