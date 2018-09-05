package com.tnicy.demo.Controller;


import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

public class Init {
    public static void init(Model model, HttpSession session){
        if (session.getAttribute("uid") != null) {
            model.addAttribute("user", session.getAttribute("username"));
            model.addAttribute("loginOrNot","退出");
            model.addAttribute("type","/quit");
            model.addAttribute("pushOrSignUp","写帖");
            model.addAttribute("pushOrSignUpType","/push");
        } else {
            model.addAttribute("user", "游客");
            model.addAttribute("loginOrNot","登录");
            model.addAttribute("type","/signIn");
            model.addAttribute("pushOrSignUp","注册");
            model.addAttribute("pushOrSignUpType","/signUp");
        }
    }
}
