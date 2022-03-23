package com.boot.springbootweb.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wanyu
 * @create 2022-03-22 11:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@TableName("user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(exist = false)
    String userName;
    @TableField(exist = false)
    String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
