package com.tnicy.demo.Controller;

import com.tnicy.demo.Mapper.ArticleMapper;
import com.tnicy.demo.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Index {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @RequestMapping("/")
    public String index(Model model, HttpSession session){
        Init.init(model, session);
        model.addAttribute("Articles", articleMapper.findAllArticle());
        return "index";
    }

}
