package com.tnicy.demo.Controller;


import com.tnicy.demo.Entity.Article;
import com.tnicy.demo.Entity.Comment;
import com.tnicy.demo.Mapper.ArticleMapper;
import com.tnicy.demo.Mapper.CommentMapper;
import com.tnicy.demo.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class article {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private CommentMapper commentMapper;

    @RequestMapping(value = "/article/{aid}")
    public String returnArticle(@PathVariable("aid") Integer aid, Model model, HttpSession session) {
        Article article = articleMapper.findByAid(aid);
        Init.init(model, session);
        articleInit(article,model,session,commentMapper);

        return "article";
    }

    private void articleInit(Article article, Model model, HttpSession session, CommentMapper commentMapper) {
        model.addAttribute("aid", article.getAid());
        model.addAttribute("title", article.getTitle());
        model.addAttribute("author", article.getUsername());
        model.addAttribute("date", article.getDate());
        model.addAttribute("content", article.getContent());
        model.addAttribute("Comments", commentMapper.findAllCommentByAid(article.getAid()));
    }
}
