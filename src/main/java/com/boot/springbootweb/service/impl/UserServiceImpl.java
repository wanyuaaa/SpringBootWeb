package com.boot.springbootweb.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.springbootweb.bean.User;
import com.boot.springbootweb.mapper.UserMapper;
import com.boot.springbootweb.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wanyu
 * @createTime 2022-03-24 0:28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

}
