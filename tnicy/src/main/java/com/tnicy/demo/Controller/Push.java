package com.tnicy.demo.Controller;

import com.tnicy.demo.Entity.Article;
import com.tnicy.demo.Entity.Comment;
import com.tnicy.demo.Entity.User;
import com.tnicy.demo.Mapper.ArticleMapper;
import com.tnicy.demo.Mapper.CommentMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.sql.Date;

@Controller
public class Push {
    @Autowired
    ArticleMapper articleMapper;

    @Autowired
    CommentMapper commentMapper;

    @GetMapping("/push")
    public String push(Model model, HttpSession session)
    {
        Init.init(model,session);
        if (session.getAttribute("uid") == null) {
            return "redirect:/";
        }
        return "push";
    }

    @PostMapping("/push")
    public String publish(Article article, HttpSession session)
    {
        java.util.Date now = new java.util.Date();
        Date date = new Date(now.getTime());

        if (session.getAttribute("uid") == null) {
            return "redirect:/";
        }

        if (articleMapper != null) {
            article.setUid((Integer) session.getAttribute("uid"));
            article.setUsername((String) session.getAttribute("username"));
            article.setDate(date);
            System.out.println("POJO: "  + ", " + article.toString());

            articleMapper.insertArticle(article.getTitle(),article.getUid(), article.getUsername(), article.getDate(),article.getContent());
        }

        return "redirect:/";
    }

    @PostMapping("/pushComment/{aid}")
    public String pushComment(Comment comment, HttpSession session, @PathVariable("aid") Integer aid) {
        java.util.Date now = new java.util.Date();
        Date date = new Date(now.getTime());
        if (session.getAttribute("uid") == null) {
            return "redirect:/signIn";
        }
        if(commentMapper !=null){
            comment.setAid(aid);
            comment.setUid((Integer) session.getAttribute("uid"));
            comment.setTime(date);
            comment.setUsername((String) session.getAttribute("username"));
            commentMapper.insertComment(comment.getAid(), comment.getUid(), comment.getUsername(), comment.getTime(), comment.getContent());
        }
        return "redirect:/article/"+aid;
    }
}
