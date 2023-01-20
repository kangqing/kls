package com.kls.gitdemo;

import com.kls.gitdemo.dao.UserDao;
import com.kls.gitdemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GitDemoApplicationTests {

    @Resource
    private UserDao userDao;

    @Test
    void contextLoads() {
        userDao.selectOne(new User("yunqing"));
    }

}
