package com.boot.springbootweb.bean;

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
public class User {
    String userName;
    String password;
}
