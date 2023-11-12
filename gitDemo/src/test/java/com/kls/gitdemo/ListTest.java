package com.kls.gitdemo;

import com.kls.gitdemo.entity.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangqing
 * @since 2023/11/12 21:57
 */
@SpringBootTest
public class ListTest {

    private List<User> list;


    @BeforeAll
    public void init() {
        list = new ArrayList<>();
        list.add(new User("1", "孙尚香", "20", "ssx@qq.com", "1"));
        list.add(new User("2", "刘备", "30", "lb@qq.com", "0"));
        list.add(new User("3", "曹操", "35", "cc@qq.com", "0"));
        list.add(new User("4", "孙权", "25", "sq@qq.com", "0"));
        list.add(new User("5", "李白", "30", "lb@qq.com", "0"));
    }

    @Test
    void test() {
        // 找出年龄大于30岁的人输出打印

        // 找出邮箱是 lb@qq.com 的输出打印

    }
}
