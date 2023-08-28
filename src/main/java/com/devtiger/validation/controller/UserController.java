package com.devtiger.validation.controller;

import com.devtiger.validation.dto.SignUpRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
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
    public String goSignUp(@ModelAttribute SignUpRequestDto signUpRequestDto) {
        return "signup";
    }

    @PostMapping("/signup")

    public String signUp(@Validated @ModelAttribute SignUpRequestDto signUpRequestDto, BindingResult bindingResult, Model model) {


        if(true){//내가 작성한 오류가 true라면
            //bindingResult.addError(new FieldError("signUpRequestDto","email","이메일 중복 입니다."));
            //bindingResult.addError(new ObjectError("signUpRequestDto","이메일 중복입니다."));

            bindingResult.rejectValue("email","duplicationCheckEmail","이메일 중복입니다.");
            bindingResult.reject("duplicationCheckEmail","이메일 중복입니다.");
        }

        if(bindingResult.hasErrors()){


            return "signup";
        }

        return "redirect:/";
    }
}
