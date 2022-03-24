package com.boot.springbootweb.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boot.springbootweb.bean.User;
import com.boot.springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * @author wanyu
 * @create 2022-03-22 11:42
 */
@Controller
public class TableController {

    @Autowired
    UserService userService;

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id,
                             @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                             RedirectAttributes ra){

        userService.removeById(id);

        ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }

    @GetMapping("/basic_table")
    public String basic_table() {
        //int a = 10/0;
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model, @RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        //表格内容遍历
        List<User> users = Arrays.asList(new User("zhangsan", "123456"), new User("lisi", "123456"), new User("wangwu", "123456"), new User("zhaoda", "123456"), new User("qianer", "123456"));

//        if(users.size()>3){
//            throw new UserTooManyException();
//        }
        List<User> list = userService.list();
        Page<User> userPage = new Page<>(pn, 2);
        Page<User> page = userService.page(userPage);

        //model.addAttribute("userList", list);
        model.addAttribute("page", page);
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }
}
