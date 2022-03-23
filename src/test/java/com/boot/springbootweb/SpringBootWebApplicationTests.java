package com.boot.springbootweb;

import com.boot.springbootweb.bean.User;
import com.boot.springbootweb.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class SpringBootWebApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        Long l = jdbcTemplate.queryForObject("select count(*) from t_user", Long.class);
        log.info("记录总数：{}", l);

        log.info("数据源类型是{}", dataSource.getClass());
    }

    @Test
    void testUserMapper(){
        User user = userMapper.selectById(1L);
        log.info("用户信息：{}",user);
    }
}
