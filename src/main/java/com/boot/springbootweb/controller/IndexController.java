package com.boot.springbootweb.controller;

import com.boot.springbootweb.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author wanyu
 * @createTime 2022-03-22 10:48
 */
@Controller
public class IndexController {

    /**
     * 来登录页
     */
    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        if (StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())) {
            //保存登录成功的用户信息
            session.setAttribute("loginUser", user);
            //重定向防止表单提交
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "账号密码错误!");
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
        return "main";
    }
}
