package com.boot.springbootweb.controller;

import com.boot.springbootweb.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author wanyu
 * @create 2022-03-22 11:42
 */
@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table(){
        int a = 10/0;
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        //表格内容遍历
        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
                new User("lisi", "123456"),
                new User("wangwu", "123456"),
                new User("zhaoda", "123456"),
                new User("qianer", "123456"));

        model.addAttribute("userList",users);
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
