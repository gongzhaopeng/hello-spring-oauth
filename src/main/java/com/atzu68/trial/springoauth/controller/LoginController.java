package com.atzu68.trial.springoauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("loginProcessUrl", "/login");
        return "base-login";
    }
}
