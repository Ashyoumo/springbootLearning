package com.tnicy.demo.Controller;

import com.tnicy.demo.Entity.User;
import com.tnicy.demo.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Sign {

    @Autowired
    UserMapper userMapper;

    //登陆
    @PostMapping("/signIn")
    public String signIn(User user, HttpSession session) {
        User tmp = userMapper.findByName(user.getUsername());
        if(tmp!=null){
            if (tmp.getPassword().equals(user.getPassword())) {
                session.setAttribute("username", tmp.getUsername());
                session.setAttribute("uid", tmp.getUid());
            }
        }

        return "redirect:/";

    }


    //请求登陆
    @GetMapping("/signIn")
    public String signIn(Model model, HttpSession session) {

        Init.init(model, session);
        return "signIn";
    }



    //请求注册
    @GetMapping("/signUp")
    public String signUp(Model model, HttpSession session) {

        Init.init(model, session);
        return "signUp";
    }

    //退出登录
    @RequestMapping("/quit")
    public String quit(HttpSession session) {
        session.setAttribute("uid", null);
        session.setAttribute("username", null);

        return "redirect:/";
    }

    //注册成功 返回首页
    @PostMapping("/signUp")
    public String signUp(User user, HttpSession session) {
        System.out.println("POJO: " + user.getClass().getName() + ", " + user.toString());

        if (userMapper != null) {
            if(userMapper.findByName(user.getUsername())==null){
                userMapper.insertByNameAndPassword(user.getUsername(), user.getPassword());
                session.setAttribute("username", user.getUsername());
                session.setAttribute("uid",user.getUid());
            }
            else {
                return "redirect:/signIn";
            }

        }


        return "redirect:/";
    }
}
