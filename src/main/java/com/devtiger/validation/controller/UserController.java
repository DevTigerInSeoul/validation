package com.devtiger.validation.controller;

import com.devtiger.validation.dto.SignUpRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/signup")
    public String goSignUp() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signUp(@ModelAttribute SignUpRequestDto signUpRequestDto) {

        return "redirect:/";
    }
}
